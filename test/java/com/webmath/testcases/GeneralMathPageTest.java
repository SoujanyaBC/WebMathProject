package com.webmath.testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.webmath.base.TestBase;
import com.webmath.pages.GeneralMathPage;


public class GeneralMathPageTest extends TestBase {
	
GeneralMathPage generalMathPage;
	
	public GeneralMathPageTest() {
		super();
	}

	
         @BeforeMethod
	 public void setup() {
         initialize();	
         generalMathPage = new GeneralMathPage(driver);
    
         }
	
	
	 @Test(priority=1)
	 public void validateFractionToDecimalConversion() {
	 generalMathPage.fractionToDecimalConversion();
         WebElement actualResult = driver.findElement(By.xpath(prop.getProperty("actual_output_locator1_gm")));
	 boolean actualOutput = actualResult.isDisplayed();
         Assert.assertTrue(actualOutput);
	 
	}
	
	 @Test(priority=2)
	 public void validateDecimalToFractionConversion() {
	 generalMathPage.decimalToFractionConversion();
	 WebElement actualResult = driver.findElement(By.xpath(prop.getProperty("actual_output_locator2_gm")));
	 boolean actualOutput = actualResult.isDisplayed();
	 Assert.assertTrue(actualOutput);
	
	 }
	

	 @AfterMethod
	 public void tearDown() {
	 driver.quit();
	 }
	
	
	
	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	


