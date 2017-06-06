package digitalTolk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class bookingPage {
	private static WebElement element = null;
	
	// Dropdown Language
	public static WebElement dpd_Language(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='example-1']/div/div/div"));
		return element;
	}
	
	// Search Input
	public static WebElement txt_Search(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='templates__booking-form']/div/div/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[1]/input"));
		return element;
	}
	
	// Ludhianiska
	public static WebElement lbl_Ludhianiska(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='templates__booking-form']/div/div/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[2]/div"));
		return element;
	}
	// Datepicker
	public static WebElement dpd_datePicker(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='datepicker']"));
		return element;		
	}
	
	public static WebElement date_06062017(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='Body__App']/div[5]/div[1]/table/tbody/tr[2]/td[2]"));
		return element;
	}
	
	public static WebElement date_06082017(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='Body__App']/div[5]/div[1]/table/tbody/tr[2]/td[4]"));
		return element;
	}
	
	// Timepicker
	public static WebElement dpd_timePicker(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='Timepicker']"));
		return element;
	}
	
	// Duration
	public static WebElement dpd_duration(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='Timepicker']"));
		return element;
	}
	
	public static WebElement du_15(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='templates__booking-form']/div/div/div[1]/div[1]/div[2]/div[4]/div/select/option[3]"));
		return  element;
	}
	
	// Telefontolk checkbox
	public static WebElement chk_Telefontolk(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='customerPhoneType']"));
		return element;
	}
	
	// + Mer val
	public static WebElement lbl_Merval(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='templates__booking-form']/div/div/div[1]/div[2]/div[1]/div/a"));
		return element;
	}
	
	// Dropdown Godkand tolk
	public static WebElement dpd_GodKand(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='form__booking--more']/div[1]/div/span/div/button"));
		return element;
	}
	
	// Godkand tolk
	public static WebElement chk_GodKand(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='form__booking--more']/div[1]/div/span/div/ul/li[3]/a/label"));
		return element;
	}
	
	// Auktoriserad tolk 
	public static WebElement chk_Auktoriserad(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='form__booking--more']/div[1]/div/span/div/ul/li[4]/a/label"));
		return element;
	}
	
	// Specific Translator 
	public static WebElement dpd_SpeciTrans(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='SpecificTranslator']/div/div/div"));
		return element;		
	}
	
	// Submit Request
	public static WebElement btn_SubmitRequest(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='SubmitRequest']"));
		return element;
	}
	
	
}
