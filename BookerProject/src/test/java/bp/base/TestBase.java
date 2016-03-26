package bp.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import bp.pages.BlogPage;
import bp.pages.ContactPage;
import bp.pages.LoginPage;
import bp.pages.MenuBarPage;

@Listeners(bp.listener.JyperionListener.class)
public class TestBase extends Driver{
	// Data read from property file
	protected String environment 	= myTestProperty.getEnvironment();
	protected String browserType 	= myTestProperty.getBrowser();
	protected String userId 		= myTestProperty.getProperty(environment, "userId");
	protected String password 		= myTestProperty.getProperty(environment, "password");
	protected String appURL 		= myTestProperty.getProperty(environment, "appURL");
	
	// Instance of all the pages
	protected static MenuBarPage menuBarPage;
	protected static LoginPage loginPage;
	protected static ContactPage contactPage;
	protected static BlogPage blogPage;
	
	@BeforeTest()
	public void setUp() {
		try {
			setDriver(browserType);
			driver.get(appURL);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println("Error....." + e.getStackTrace());
		}
		
		menuBarPage     = PageFactory.initElements(driver, MenuBarPage.class);
		loginPage       = PageFactory.initElements(driver, LoginPage.class);
		contactPage     = PageFactory.initElements(driver, ContactPage.class);
		blogPage        = PageFactory.initElements(driver, BlogPage.class);
	}

	//@AfterTest()
	public void tearDown() {
		driver.quit();
	}

}
