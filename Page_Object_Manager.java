package class1;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manager {

	public static WebDriver driver;

	private Pom_Class pc;

	public Page_Object_Manager(WebDriver driver2)
	{
		this.driver = driver2;
	}

	public Pom_Class getPc() {
		if(pc == null)
		
			pc = new Pom_Class(driver);

		return pc;
	}

	
	
	
	
	

	
			
	

}


