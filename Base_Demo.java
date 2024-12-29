package class1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Demo {
	
	public static WebDriver driver;
	
	public static WebDriver brwlaunch() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public static void urllaunch(String url) {
       driver.get(url);
	}
	
	public static void passinput(WebElement webelement, String input) {
       webelement.sendKeys(input);
		
 	}
	
	public static void clickonelement(WebElement element) {

		element.click();
	}
	
	public static void screenshot(String filepath) throws IOException {
		
		TakesScreenshot d = (TakesScreenshot) driver;
		File screenshotAs = d.getScreenshotAs(OutputType.FILE);
		File des = new File(filepath);
		FileUtils.copyFile(screenshotAs, des);
		

	}
	
	public static void dropdown(WebElement element, int value, String value1) {
		Select s = new Select(element);
		s.selectByIndex(value);
		s.selectByValue(value1);
	
      
	}

}
