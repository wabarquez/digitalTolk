package digitalTolk;

	import org.openqa.selenium.WebDriver;
	import digitalTolk.mainPage;

public class LogIn_Action {
	
	public static void Execute(WebDriver driver, String sEmail, String sPassword){
		mainPage.lbl_Login(driver).click();
		mainPage.txtbx_Email(driver).sendKeys(sEmail);
		mainPage.lbl_pwd(driver).sendKeys(sPassword);
		mainPage.btn_Login(driver).click();
	}
		

}
