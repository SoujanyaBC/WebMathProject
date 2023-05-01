package com.webmath.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import com.webmath.base.TestBase;
import com.webmath.pages.HomePage;

public class HomePageTest extends TestBase{
	
	HomePage homePage;
	
	public HomePageTest() {
		super();
	}

	
	@BeforeMethod
	public void setup() {
	initialize();
	homePage = new HomePage(driver);
	}
	
	@Test(priority=1)
	public void homePageTitleTest() {
	String title = homePage.validateHomePageTitle();
	String expectedTitle = prop.getProperty("expected_title_home");
	Assert.assertEquals(title,expectedTitle);
	
	}	
	
	@Test(priority=2)
	public void validateWebmathLogoTest() {
	boolean flag = homePage.validateWebmathLogo();
	Assert.assertTrue(flag);
	}
	    
	 @Test(priority=3)
	 public void validateMathForEveryOneLink() {
         homePage.mathForEveryOneLink();
		
	 }
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	


