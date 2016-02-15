package bp.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import bp.base.TestBase;

public class TestContactPage extends TestBase{
	//submit contact request to register
	//commented the submission and assertion steps
	@Test()
	public void testSendContactRequest(){
		menuBarPage.aboutBookerMenu.click();
		menuBarPage.contactUsLink.click();
		contactPage.selectFromDropdownList(contactPage.departmentDropDownList, "Partners");
		contactPage.firstNameTextField.sendKeys("text");
		contactPage.lastNameTextField.sendKeys("test");
		contactPage.businessNameTextField.sendKeys("mySelf");
		contactPage.phoneTextField.sendKeys("123-463-0934");
		contactPage.emailTextField.sendKeys("myname@yahoo.com");
		contactPage.messagelTextField.sendKeys("testing");
		//contactPage.contactUsSubmitButton.click();
		//Assert.assertEquals(driver.getTitle(), "Thanks for Your Booker Partner Program Inquiry");
		menuBarPage.bookerLogo.click();
	}

}
