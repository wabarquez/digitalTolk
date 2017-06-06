package digitalTolk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class myBooking {
	private static WebElement element = null;
	
	public static WebElement header_MyBooking(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='Page__Heading']"));
		return element;
	}
	
	public static WebElement dpd_MyBooking(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='Body__App']/nav/div[2]/div/div[2]/ul/li[3]/a"));
		return element;
	}
	
	public static WebElement lbl_Tidigare(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='Body__App']/nav/div[2]/div/div[2]/ul/li[3]/ul/li[2]/a"));
		return element;
	}
	
	public static WebElement btn_Detaljer(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='2017-06']/table/tbody/tr[1]/td[9]/button"));
		return element;
	}
}
