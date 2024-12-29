package demo_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Demo {

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
	public static void clickonelement(WebElement element) {
		
		element.click();
        
	}

}
