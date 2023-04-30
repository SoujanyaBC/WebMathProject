package com.webmath.testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webmath.base.TestBase;

import com.webmath.pages.MathForEveryOnePage;

public class MathForEveryOnePageTest extends TestBase {
	
	MathForEveryOnePage mathForEveryOnePage;
	
	public MathForEveryOnePageTest() {
		super();
	}

	 @BeforeMethod
	 public void setup() {
	 initialize();
	 mathForEveryOnePage = new MathForEveryOnePage(driver);
	 }
	
	 @Test(priority=1)
	 public void tipCalculationTest() {
	 mathForEveryOnePage.tipCalculation();
     WebElement actualResult = driver.findElement(By.xpath(prop.getProperty("actual_output_locator1")));
	 String actualOutput =  actualResult.getText();
	 String expectedOutput = prop.getProperty("expected_output");
	 Assert.assertEquals(actualOutput,expectedOutput);	
	}
	
	@Test(priority=2)
	public void validateSimpleInterestCalculation() {
	mathForEveryOnePage.simpleInterestCalculation();
	WebElement actualResult = driver.findElement(By.xpath(prop.getProperty("actual_output_locator2")));
	String actualOutput =  actualResult.getText();
	String expectedOutput = prop.getProperty("expected_output_1");
	Assert.assertEquals(actualOutput,expectedOutput);
	
	}
	
	
	@Test(priority=3)
	public void validateCostOfElectricityCalculation() {
	mathForEveryOnePage.costOfElectricityCalculation();
	WebElement actualResult = driver.findElement(By.xpath(prop.getProperty("actual_output_locator3")));
	String actualOutput =  actualResult.getText();
	String expectedOutput = prop.getProperty("expected_output_2");
	Assert.assertEquals(actualOutput,expectedOutput);
	
	}
	
    @Test(priority=4)
	public void validateWeightOnAnotherPlanetCalculation() {
	mathForEveryOnePage.weightOnAnotherPlanetCalculation();
	WebElement actualResult = driver.findElement(By.xpath(prop.getProperty("actual_output_locator4")));
	String actualOutput =  actualResult.getText();
	String expectedOutput = prop.getProperty("expected_output_3");
	Assert.assertEquals(actualOutput,expectedOutput);
	}
    
    
    @Test(priority=5)
	public void validateLengthConversion() {
	mathForEveryOnePage.lengthConversion();
	WebElement actualResult = driver.findElement(By.xpath(prop.getProperty("actual_output_locator5")));
	String actualOutput =  actualResult.getText();
	String expectedOutput = prop.getProperty("expected_output_4");
	Assert.assertEquals(actualOutput,expectedOutput);

	
	}
	
	
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}
		
	
}
