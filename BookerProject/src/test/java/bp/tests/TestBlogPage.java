package bp.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import bp.base.TestBase;

public class TestBlogPage extends TestBase{
	
	@Test()
	public void testBlogPageHeader() throws InterruptedException {
		menuBarPage.aboutBookerFreeSample.click();
		Thread.sleep(5000);
		menuBarPage.blogLink.click();
		String actual = blogPage.blogPageHeader.getText();
		String expected = "The Booker Blog";
		Assert.assertEquals(actual, expected);
	}
	
	

}
