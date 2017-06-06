package digitalTolk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.Assert;

import digitalTolk.mainPage;
import digitalTolk.bookingPage;
import digitalTolk.confirmationPage;
import digitalTolk.myBooking;
import digitalTolk.Constant;
import digitalTolk.LogIn_Action;

public class TestCases_1 {
	private static WebDriver driver = null;
	
	@BeforeTest
	public void beforeTest(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(Constant.URL);
	}
	
	@Test(priority = 0)
	public void verify_customer_login_successfully(){
		LogIn_Action.Execute(driver, Constant.Email, Constant.Password);
		System.out.println("Customer Login Successfully");
		Assert.assertTrue(mainPage.lbl_Logout(driver).isDisplayed());
	}
	
	@Test(priority = 1)
	public void verify_correct_email_confirmation(){
		bookingPage.dpd_Language(driver).click();
		bookingPage.txt_Search(driver).sendKeys(Constant.Language);
		bookingPage.lbl_Ludhianiska(driver).click();
		System.out.println("Ludhianiska has been selected.");
		// Select Date
		bookingPage.dpd_datePicker(driver).click();
		bookingPage.date_06082017(driver).click();
		
		// Time
		bookingPage.dpd_timePicker(driver).sendKeys(Constant.Time);
		
		// Duration
		bookingPage.du_15(driver).click();
		
		// Telefontolk checkbox
		bookingPage.chk_Telefontolk(driver).click();
		
		bookingPage.lbl_Merval(driver).click();
		
		bookingPage.dpd_GodKand(driver).click();
		bookingPage.chk_GodKand(driver).click();
		bookingPage.chk_Auktoriserad(driver).click();
		
		bookingPage.dpd_GodKand(driver).click();
		
		bookingPage.btn_SubmitRequest(driver).click();
		String Email = confirmationPage.txt_Email(driver).getAttribute("value");
		Assert.assertEquals(Email, Constant.Email);
	}
	@Test(priority = 2)
	public void verify_correct_booking_ID(){
		confirmationPage.btn_Skicka_bokning(driver).click();
		//Assert.assertTrue(myBooking.header_MyBooking(driver).isDisplayed());
		String TD = driver.findElement(By.xpath(".//*[@id='my-bookings--items--body']/table/tbody/tr[1]/td[1]")).getText();
		System.out.println(TD);
	}
	
	@AfterTest
	public void afterTest() {
		  driver.quit();
	  }
}
