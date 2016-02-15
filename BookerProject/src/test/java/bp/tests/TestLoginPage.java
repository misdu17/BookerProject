package bp.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import bp.base.TestBase;

public class TestLoginPage extends TestBase{
	//test login with invalid credentials 
	@Test()
	public void testInvalidLogin(){
		menuBarPage.loginLink.click();
		loginPage.loginPageAccountNameField.sendKeys("test");
		loginPage.loginPageUserNameField.sendKeys("test");
		loginPage.loginPagePasswordField.sendKeys("test");
		loginPage.loginPageLoginButton.click();
		Assert.assertEquals(loginPage.loginPageErrorMessage.getText(), 
				"Could not login. Please check your Username and Password.");	
	}
	
	//test get started link in login page after invalid login
	@Test(dependsOnMethods = "testInvalidLogin", priority = 1)
	public void testGetStartedLink(){
		loginPage.loginPageSignUpLink.click();
		loginPage.waitUntillUrlContains(30, "contact");
		Assert.assertEquals(driver.getTitle(), "Contact Us | Booker");
		driver.navigate().back();
		loginPage.loginPageBookerLogo.click();
	}
	
	//test retrieve credential link after invalid login
	@Test(dependsOnMethods = "testInvalidLogin")
	public void testRetriveCredential(){
		loginPage.loginPageRetriveCredentialsLink.click();
		Assert.assertTrue(loginPage.retrieveCredentialMessage.isDisplayed());
		loginPage.retrieveCredentialCancelButton.click();
	}

}
