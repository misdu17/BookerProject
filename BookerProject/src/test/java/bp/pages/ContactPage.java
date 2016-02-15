package bp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bp.base.PageBase;

public class ContactPage extends PageBase{
	
	@FindBy(xpath = "//*[@id='frmLogin']/div[3]/div[2]/div[1]")
	public WebElement contactPageHeaderMessage;
	
	@FindBy(id = "Contact_Us_Department__c")
	public WebElement departmentDropDownList;
	
	@FindBy(id = "FirstName")
	public WebElement firstNameTextField;
	
	@FindBy(id = "LastName")
	public WebElement lastNameTextField;
	
	@FindBy(name = "Company")
	public WebElement businessNameTextField;
	
	@FindBy(name = "Phone")
	public WebElement phoneTextField;
	
	@FindBy(id = "Email")
	public WebElement emailTextField;
	
	@FindBy(id = "NumberOfEmployees")
	public WebElement numberOfEmployeesField;
	
	@FindBy(id = "Locations__c")
	public WebElement locationsField;
	
	
	@FindBy(id = "Comments__c")
	public WebElement messagelTextField;
	
	@FindBy(css = "button[class='btn btn-blue'][type='submit']")
	public WebElement contactUsSubmitButton;
	

}
