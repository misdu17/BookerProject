package bp.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	public String envPropertyFilePath  = System.getProperty("user.dir") + "/BookerProject/src/test/java/bp/properties/egEnvTest.properties";

	public String qaPropertyFilePath  = System.getProperty("user.dir") + "/BookerProject/src/test/java/bp/properties/qaTest.properties";
	//Users/Zakia/IntelliJProjects/BookerProject/BookerProject/src/test/java/bp/properties/egEnvTest.properties
	public String getPropertyValue(String propertyKey, String propertyFilePath){
		System.out.println(envPropertyFilePath);
		System.out.println(qaPropertyFilePath);
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
		if (environment.equals("QA")) {
			value = getPropertyValue(propertyKey, qaPropertyFilePath);

		} else {
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
