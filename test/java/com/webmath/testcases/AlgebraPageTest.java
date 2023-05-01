package com.webmath.testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.webmath.base.TestBase;
import com.webmath.pages.AlgebraPage;
public class AlgebraPageTest extends TestBase {
   AlgebraPage algebraPage;
	
	public AlgebraPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
	initialize();
	algebraPage = new AlgebraPage(driver);
	}
	
        @Test
	public void validateSquareRootsSimplification() {
	algebraPage.squareRootsSimplification();
        WebElement actualResult = driver.findElement(By.xpath(prop.getProperty("actual_output_locator_1_sq")));
	boolean actualOutput =  actualResult.isDisplayed();
	Assert.assertTrue(actualOutput);	
	}

	@AfterMethod
	public void tearDown() {
	driver.quit();
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


