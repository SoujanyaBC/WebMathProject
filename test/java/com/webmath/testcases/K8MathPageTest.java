package com.webmath.testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.webmath.base.TestBase;
import com.webmath.pages.K8MathPage;


public class K8MathPageTest extends TestBase{
 K8MathPage k8MathPage;
	
	public K8MathPageTest() {
		super();
	}

	
	@BeforeMethod
	public void setup() {
	initialize();
	k8MathPage = new K8MathPage(driver);
	 
	}
	
        @Test(priority=1)
	public void validateMultiplication() {
	k8MathPage.multiplication();
        WebElement actualResult = driver.findElement(By.xpath(prop.getProperty("actual_output_locator_1_k8")));
	String actualOutput =  actualResult.getText();
	String expectedOutput = prop.getProperty("expected_output_1_k8");
	Assert.assertEquals(actualOutput,expectedOutput);	
	}
	
	@Test(priority=2)
	public void validateDivision() {
	k8MathPage.division();
	WebElement actualResult = driver.findElement(By.xpath(prop.getProperty("actual_output_locator_2_k8")));
	boolean actualOutput =  actualResult.isDisplayed();
	Assert.assertTrue(actualOutput);
	}
	
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}
	

}
