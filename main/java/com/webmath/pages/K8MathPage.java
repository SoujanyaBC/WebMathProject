package com.webmath.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.webmath.base.TestBase;

public class K8MathPage extends TestBase {
	
	    WebDriver driver;

	  
        public K8MathPage(WebDriver driver){
		this.driver = driver;
	    }
    
        public void multiplication() {
        	
        WebElement k8Math = driver.findElement(By.linkText(prop.getProperty("k_8_Math")));
    	k8Math.click();	
    	
    	WebElement multiply = driver.findElement(By.linkText(prop.getProperty("multiply_1")));
		multiply.click();
		
		WebElement multiplyNumber1 = driver.findElement(By.xpath(prop.getProperty("multiply_Number1")));
		multiplyNumber1.sendKeys(prop.getProperty("multiplyNumber1_value"));
		
		WebElement multiplyNumber2 = driver.findElement(By.xpath(prop.getProperty("multiply_Number2")));
		multiplyNumber2.sendKeys(prop.getProperty("multiplyNumber2_value"));
		
		WebElement multiplyThemButton = driver.findElement(By.xpath(prop.getProperty("multiply_Them_Button")));
		multiplyThemButton.click();
		
		WebElement iframe = driver.findElement(By.xpath(prop.getProperty("i_frame")));
  	    driver.switchTo().frame(iframe);
  	    
  	    try {
			Thread.sleep(2000);
		
		
  	    Actions actions = new Actions(driver);
  	    actions.scrollByAmount(0,1000).perform();
		
  	    Thread.sleep(1000);
  	    } catch (InterruptedException e) {
		e.printStackTrace();
		}
        }
		
		public void division() {
			
		WebElement k8Math = driver.findElement(By.linkText(prop.getProperty("k_8_Math")));
	    k8Math.click();		
		
		WebElement divide = driver.findElement(By.linkText(prop.getProperty("divide")));
		divide.click();
		
		WebElement divideNumber1 = driver.findElement(By.name(prop.getProperty("divide_Number_1")));
		divideNumber1.sendKeys(prop.getProperty("divideNumber1_value"));
		
		WebElement divideNumber2 = driver.findElement(By.name(prop.getProperty("divide_Number_2")));
		divideNumber2.sendKeys(prop.getProperty("divideNumber2_value"));
		
		WebElement divideThemButton = driver.findElement(By.xpath(prop.getProperty("divide_Them_Button")));
		divideThemButton.click();
		
		WebElement iframe = driver.findElement(By.xpath(prop.getProperty("i_frame")));
  	    driver.switchTo().frame(iframe);
		
	
		}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
