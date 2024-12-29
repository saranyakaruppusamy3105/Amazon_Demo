package demo_Class;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public static WebDriver driver;
	
	private Pom_Login pl;
	
	public PageObjectManager(WebDriver driver2){
	this.driver = driver2;
	}
	

	public Pom_Login getPl() {
		
		if(pl == null) {
		pl = new Pom_Login(driver);
		}
		return pl;
	}

	
	
	

}
