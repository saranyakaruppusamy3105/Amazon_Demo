package demo_Class;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config_Reader{
	
	public static Properties p;
	
	public Config_Reader() throws IOException {
		
		File f = new File("C:\\Users\\saran\\eclipse-workspace\\Maven_11AM\\Login.properties");
		   
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fis);
		

	}

	public String geturl() throws IOException {
		
		

		String url = p.getProperty("url");
		
		return url;
   }
	
	public String getusername() {
    
		String username = p.getProperty("useranme");
		
		return username;
	}
	
	public String getpassword() {

		String password = p.getProperty("password");
		
		return password;
	}
	
	
}
