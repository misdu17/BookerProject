package bp.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import bp.base.TestBase;

public class TestBlogPage extends TestBase{
	
	@Test()
	public void testBlogPageHeader(){
		menuBarPage.blogLink.click();
		String actual = blogPage.blogPageHeader.getText();
		String expected = "The Booker Bloged";
		Assert.assertEquals(actual, expected);
	}
	
	

}
