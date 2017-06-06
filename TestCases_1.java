package digitalTolk;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.Assert;

import digitalTolk.mainPage;
import digitalTolk.bookingPage;
import digitalTolk.confirmationPage;
import digitalTolk.myBooking;
import digitalTolk.Constant;

public class TestCases_1 {
	private static WebDriver driver = null;
	
	@BeforeTest
	public void beforeTest(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constant.URL);
	}
	
	@Test(priority = 0)
	public void verify_customer_login_successfully(){
		mainPage.lbl_Login(driver).click();
		mainPage.txtbx_Email(driver).sendKeys(Constant.Email);
		mainPage.txtbx_pwd(driver).sendKeys(Constant.Password);
		mainPage.btn_Login(driver).click();
		Assert.assertTrue(mainPage.lbl_Logout(driver).isDisplayed());
	}
	
	@Test(priority = 1)
	public void verify_correct_email_confirmation(){
		bookingPage.dpd_Language(driver).click();
		bookingPage.txt_Search(driver).sendKeys(Constant.Language);
		bookingPage.lbl_Ludhianiska(driver).click();
		
		// Select Date
		bookingPage.dpd_datePicker(driver).click();
		bookingPage.date_06062017(driver).click();
		
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
	public void verify_correct_booking_ID(String[] args) throws InterruptedException{
		//confirmationPage.btn_Avbryt(driver).click();
		confirmationPage.btn_Skicka_bokning(driver).click();
		Assert.assertTrue(myBooking.header_MyBooking(driver).isDisplayed());
		/*myBooking.dpd_MyBooking(driver).click();
		myBooking.lbl_Tidigare(driver).click();
		Thread.sleep(1000);
		myBooking.btn_Detaljer(driver).click();*/
	
	}
	
	
	@AfterTest
	public void afterTest() {
		  driver.quit();
	  }
}
