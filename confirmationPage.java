package digitalTolk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class confirmationPage {
	private static WebElement element = null;
	
	public static WebElement txt_Email(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='user_email']"));
		return element;
	}
	
	public static WebElement btn_Avbryt(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='templates__booking-form-cofirmation']/div/div[6]/button[1]"));
		return element;
	}
	
	public static WebElement btn_Skicka_bokning(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='emailformbtn']"));
		return element;
		
	}
}
