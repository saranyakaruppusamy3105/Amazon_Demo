package demo_Class;

import java.io.IOException;

public class FileReaderManager {
	
	public FileReaderManager() {
	
	}
	
	public static FileReaderManager getfrmm() {
		FileReaderManager frmm = new FileReaderManager();
		return frmm;
	}
	
	public Config_Reader getcr() throws IOException {
		Config_Reader cr = new Config_Reader();
		
		return cr;
				
	}

}
