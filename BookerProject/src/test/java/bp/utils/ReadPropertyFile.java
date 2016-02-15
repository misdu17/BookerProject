package bp.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	public String envPropertyFilePath  = System.getProperty("user.dir") + "/src/test/java/bp/properties/egEnvTest.properties";
	public String qaPropertyFilePath  = System.getProperty("user.dir") + "/src/test/java/bp/properties/qaTest.properties";
	
	public String getPropertyValue(String propertyKey, String propertyFilePath){
		String value = "";
		try{
			File file = new File(propertyFilePath);
			FileInputStream fileInput = new FileInputStream(file);
			Properties properties = new Properties();
			properties.load(fileInput);
			fileInput.close();
			value = properties.getProperty(propertyKey);
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		return value;
	}
	
	public String getProperty(String environment, String propertyKey) {
		String value = null;
		switch (environment) {
		case "QA":
			value = getPropertyValue(propertyKey, qaPropertyFilePath);
			break;
		default:
			break;
		}
		return value;
	}
	
	public String getEnvironment(){
		return getPropertyValue("environment", envPropertyFilePath);
	}
	
	public String getBrowser(){
		return getPropertyValue("browserType", envPropertyFilePath);
	}

}
