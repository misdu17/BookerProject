package bp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bp.base.PageBase;

public class LoginPage extends PageBase{
	
	@FindBy(id = "ucLoginHeader_ctl00_lnkLogo")
	public WebElement loginPageBookerLogo;
	
	@FindBy(name = "txtAccountName")
	public WebElement loginPageAccountNameField;
	
	@FindBy(id = "txtUsername")
	public WebElement loginPageUserNameField;
	
	@FindBy(name = "txtPassword")
	public WebElement loginPagePasswordField;
	
	@FindBy(id = "btnSubmit")
	public WebElement loginPageLoginButton;
	
	@FindBy(linkText = "Retrieve your credentials.")
	public WebElement loginPageRetriveCredentialsLink;
	
	@FindBy(css = "a[href='http://www.booker.com/contact-us']")
	public WebElement loginPageSignUpLink;
	
	@FindBy(css = "div[class='error-ui']")
	public WebElement loginPageErrorMessage;

	@FindBy(id = "ucForgotPassword_btnCancel")
	public WebElement retrieveCredentialCancelButton;
	
	@FindBy(xpath = "//*[@id='ucForgotPassword_pnlForgotPasswordForm']/div[1]/p")
	public WebElement retrieveCredentialMessage;
	

	
}
