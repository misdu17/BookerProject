package bp.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase extends Driver{
	
	public void waitUntillUrlContains(int seconds, String text){
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.urlContains(text));
	}
	
	public void selectFromDropdownList(WebElement element, String value){
		new Select(element).selectByVisibleText(value);
	}
	
	public void selectFromDropdownList(WebElement element, int index){
		new Select(element).selectByIndex(index);
	}
	
	
	

}
