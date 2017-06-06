package digitalTolk;



import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.Assert;

import digitalTolk.mainPage;
/*import digitalTolk.bookingPage;
import digitalTolk.confirmationPage;
import digitalTolk.myBooking;*/
import digitalTolk.Constant;
import digitalTolk.LogIn_Action;

public class TestCases_2 {
private static WebDriver driver = null;
	
	@BeforeTest
	public void beforeTest(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(Constant.URL);
	}
	
	@Test(priority = 0)
	public void verify_standard_translator_login_successfully(){
		LogIn_Action.Execute(driver, Constant.sTrans_Email, Constant.sTrans_Password);
		System.out.println("Standard Translator Login Successfully");
		Assert.assertTrue(mainPage.lbl_Logout(driver).isDisplayed());
	}
	
	@AfterTest
	public void afterTest() {
		  driver.quit();
	  }
}
