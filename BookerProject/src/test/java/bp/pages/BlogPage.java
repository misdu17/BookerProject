package bp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bp.base.PageBase;

public class BlogPage extends PageBase{
	
	@FindBy(xpath = "//*[@id='hubs-container']/div[2]/div/div[1]/h1")
	public WebElement blogPageHeader;
	
	

}
