package digitalTolk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mainPage {
	private static WebElement element = null;
	
	//Login 
	public static WebElement lbl_Login(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='Body__App']/nav/div[2]/div/div[2]/ul/li[6]/a"));
		return element;
	}
	
	//Logout
	public static WebElement lbl_Logout(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='Body__App']/nav/div[2]/div/div[2]/ul/li[5]/a"));
		return element;
	}
	
	public static WebElement lbl_Logout_1(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='Body__App']/nav/div[2]/div/div[2]/ul/li[4]/a"));
		return element;
	}
	
	// Email label
	public static WebElement lbl_Email(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='loginForm']/div[1]/label"));
		return element;
	}
	
	// Email textbox
	public static WebElement txtbx_Email(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='email']"));
		return element;
	}
	
	// Password label
	public static WebElement lbl_pwd(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='loginForm']/div[2]/label"));
		return element;
	}
	
	// Password Textbox
	public static WebElement txtbx_pwd(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='pwd']"));
		return element;
	}
	
	//Login button
	public static WebElement btn_Login(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='loginForm']/div[4]/div/button"));
		return element;
	}

}
