package bp.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import bp.utils.ReadPropertyFile;

public class Driver {
	public static WebDriver driver;
	public String chromDriverPath = System.getProperty("user.dir") + "/src/test/java/bp/remotedriver/";
	public static ReadPropertyFile myTestProperty = new ReadPropertyFile();

	public void setDriver(String browserType) {
		if (browserType.equals("chrome")) {
			driver = initChromeDriver();

		} else if (browserType.equals("firefox")) {
			driver = initFirefoxDriver();

		} else {
			System.out.println("browser : " + browserType + " is invalid, Launching Firefox as browser of choice..");
			driver = initFirefoxDriver();
		}
	}

	public WebDriver initChromeDriver() {
		System.out.println("Launching google chrome with new profile..");
		System.out.println(chromDriverPath);
		System.setProperty("webdriver.chrome.driver", chromDriverPath + "chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public WebDriver initFirefoxDriver() {
		System.out.println("Launching Firefox browser..");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

}
