package com.webmath.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.webmath.base.TestBase;

       public class GeneralMathPage extends TestBase {
	
	   WebDriver driver;

	  
        public GeneralMathPage(WebDriver driver){
		this.driver = driver;
	     
        }
    
        public void fractionToDecimalConversion() {
    	
                WebElement generalMath = driver.findElement(By.xpath(prop.getProperty("general_math")));
                generalMath.click();
		
		WebElement fractionToDecimal = driver.findElement(By.linkText(prop.getProperty("fraction_to_decimal")));
		fractionToDecimal.click();
		
		WebElement fractionToConvertTop = driver.findElement(By.xpath(prop.getProperty("fraction_to_convert_top")));
		fractionToConvertTop.clear();
		fractionToConvertTop.sendKeys(prop.getProperty("fractionToConvertTop_value"));
		
		WebElement fractionToConvertBottom = driver.findElement(By.xpath(prop.getProperty("fraction_to_convert_bottom")));
		fractionToConvertBottom.clear();
		fractionToConvertBottom.sendKeys(prop.getProperty("fractionToConvertBottom_value"));
		
		WebElement decimalPlaces = driver.findElement(By.xpath(prop.getProperty("decimal_places")));
		decimalPlaces.clear();
		decimalPlaces.sendKeys(prop.getProperty("decimalPlaces_value"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		WebElement fractionSubmitButton = driver.findElement(By.xpath(prop.getProperty("fraction_submit_button")));
		fractionSubmitButton.click();
		
		WebElement iframe = driver.findElement(By.xpath(prop.getProperty("i_frame")));
  	        driver.switchTo().frame(iframe);
		
  	    
  	        Actions actions = new Actions(driver);
  	        actions.scrollByAmount(0,300).perform();
	
        }
         
        
        public void decimalToFractionConversion() {
        
        	
               WebElement generalMath = driver.findElement(By.xpath(prop.getProperty("general_math")));
               generalMath.click();
        
                WebElement decimalToFraction = driver.findElement(By.linkText(prop.getProperty("decimal_to_fraction")));
		decimalToFraction.click();
		
		WebElement positiveDecimalNumber = driver.findElement(By.id(prop.getProperty("positive_decimal_number")));
		positiveDecimalNumber.sendKeys(prop.getProperty("positiveDecimalNumber_value"));
		

		WebElement decimalSubmitButton = driver.findElement(By.xpath(prop.getProperty("decimal_submit_button")));
		decimalSubmitButton.click();
	
		WebElement iframe = driver.findElement(By.xpath(prop.getProperty("i_frame")));
  	        driver.switchTo().frame(iframe);
  	    
  	        Actions actions = new Actions(driver);
  	        actions.scrollByAmount(0,500).perform();
 
        }

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

