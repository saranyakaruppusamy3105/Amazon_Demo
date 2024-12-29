package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {
	
	public static WebDriver driver;
	
	public static WebDriver browserlaunch() {
		
        WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		}
	
	public static void urllaunch(String url) {

		driver.get(url);
	}
	
	public static void passInput(WebElement webelement, String input) {
		
		webelement.sendKeys(input);
		
}
	public static void clickOnElement(WebElement element) {
		
		element.click();

	}
	
	

}
