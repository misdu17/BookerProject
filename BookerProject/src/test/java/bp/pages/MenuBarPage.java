package bp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bp.base.PageBase;

public class MenuBarPage extends PageBase{
	
	@FindBy(linkText = "Login")
	public WebElement loginLink;
	
	@FindBy(css = "img[src='http://www.booker.com/sites/booker/files/logo-hi-be-free.jpg']")
	public WebElement bookerLogo;
	
	@FindBy(css = "span[data-title='About Booker ']")
	public WebElement aboutBookerMenu;
	
	@FindBy(css = "a[href='/contact']")
	public WebElement contactUsLink;

	@FindBy(linkText = "Pricing")
	public WebElement pricingLink;
	
	@FindBy(linkText = "Blog")
	public WebElement blogLink;

	@FindBy(css = "button[class='close']")
	public WebElement aboutBookerFreeSample;


}
