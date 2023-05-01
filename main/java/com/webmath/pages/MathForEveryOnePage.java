package com.webmath.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.webmath.base.TestBase;

   public class MathForEveryOnePage extends TestBase {
   WebDriver driver;

  
    public MathForEveryOnePage(WebDriver driver){
    this.driver = driver;
	
    }
    
    public boolean tipCalculation() {
    	
    	
    	WebElement mathForEvery1 = driver.findElement(By.linkText(prop.getProperty("math_for_every_one_button")));
    	mathForEvery1.click();
    	
    	driver.getTitle();
    	
    	WebElement figuringATip = driver.findElement(By.linkText(prop.getProperty("figuring_Tip")));
    	figuringATip.click();
    	
    	WebElement typeTheTipAmount = driver.findElement(By.name(prop.getProperty("tip_Amount")));
    	typeTheTipAmount.clear();
    	typeTheTipAmount.sendKeys(prop.getProperty("tip_amount_value"));
 	    
         WebElement costOfMeal=driver.findElement(By.name(prop.getProperty("meal_Cost")));
 	 costOfMeal.sendKeys(prop.getProperty("meal_cost_value"));
 	    
 	 WebElement figureTipButton = driver.findElement(By.xpath(prop.getProperty("tip_Button")));
 	 figureTipButton.click();
 	    
 	  WebElement iframe = driver.findElement(By.xpath(prop.getProperty("i_frame")));
 	  driver.switchTo().frame(iframe);
		
 	  return true;
 	    
        }
    
        public boolean simpleInterestCalculation() {
    	 
    	       WebElement mathForEvery1 = driver.findElement(By.linkText(prop.getProperty("math_for_every_one_button")));
               mathForEvery1.click(); 
    	
    	        WebElement simpleInterest = driver.findElement(By.linkText(prop.getProperty("simple_interest")));
 		simpleInterest.click();
 		
 		WebElement principalAmount = driver.findElement(By.xpath(prop.getProperty("principal")));
 		principalAmount.sendKeys(prop.getProperty("principal_amount_value"));
 		
 	        WebElement interestRate = driver.findElement(By.xpath(prop.getProperty("interest")));
 		interestRate.sendKeys(prop.getProperty("interest_rate_value"));
 		
 		WebElement annualInterestDropdown = driver.findElement(By.xpath(prop.getProperty("interest_units")));
 		Select select = new Select(annualInterestDropdown);
 		select.selectByIndex(Integer.parseInt(prop.getProperty("annual_interest_dropdown_value")));
 		
 		WebElement desiredTime = driver.findElement(By.xpath(prop.getProperty("desired_time")));
 		desiredTime.sendKeys(prop.getProperty("desired_time_value"));
 		
 		WebElement desiredTimeDropdown = driver.findElement(By.xpath(prop.getProperty("desired_time_units")));
 		Select sc = new Select(desiredTimeDropdown);
 		sc.selectByIndex(Integer.parseInt(prop.getProperty("desired_time_dropdown_value")));
 		
 		WebElement amountOfInterestButton= driver.findElement(By.xpath(prop.getProperty("amt_of_interest")));
 		amountOfInterestButton.click();
 		
 		WebElement iframe = driver.findElement(By.xpath(prop.getProperty("i_frame")));
  	        driver.switchTo().frame(iframe);
		
  	    
  	        return true;
  	    
        }
     
     
        public boolean costOfElectricityCalculation() {
    	 
     	        WebElement mathForEvery1 = driver.findElement(By.linkText(prop.getProperty("math_for_every_one_button")));
                mathForEvery1.click(); 
     
                WebElement CostOfElectricity = driver.findElement(By.linkText(prop.getProperty("cost_of_electricity")));
		CostOfElectricity.click();
		
		WebElement power = driver.findElement(By.xpath(prop.getProperty("power")));
		power.sendKeys(prop.getProperty("power_value"));
		
	        WebElement time = driver.findElement(By.xpath(prop.getProperty("time")));
		time.sendKeys(prop.getProperty("time_value"));
		
		WebElement hoursDropdown = driver.findElement(By.xpath(prop.getProperty("hours_dropdown")));
		Select hours = new Select(hoursDropdown);
		hours.selectByIndex(Integer.parseInt(prop.getProperty("hours_dropdown_value")));
		
		WebElement costPerkWh = driver.findElement(By.xpath(prop.getProperty("cost_per_kwh")));
		costPerkWh.clear();
		costPerkWh.sendKeys(prop.getProperty("cost_per_kwh_value"));
		
		WebElement electricitySubmitButton = driver.findElement(By.xpath(prop.getProperty("electricity_submit_button")));
		electricitySubmitButton.click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	    WebElement iframe = driver.findElement(By.xpath(prop.getProperty("i_frame")));
  	    driver.switchTo().frame(iframe);
		
  	    
  	    Actions actions = new Actions(driver);
  	    actions.scrollByAmount(0,300).perform();
		
		return true;
		
        }
     
	public void weightOnAnotherPlanetCalculation() {
	    	 
	        WebElement mathForEvery1 = driver.findElement(By.linkText(prop.getProperty("math_for_every_one_button")));
	        mathForEvery1.click(); 
	     
		WebElement weightOnAnotherPlanet = driver.findElement(By.linkText(prop.getProperty("weight_on_another_planet")));
		weightOnAnotherPlanet.click();
		
		WebElement weigh= driver.findElement(By.xpath(prop.getProperty("weigh")));
		weigh.sendKeys(prop.getProperty("weigh_value"));
		
		WebElement weighDropdown = driver.findElement(By.xpath(prop.getProperty("weigh_dropdown")));
		Select weigh1 = new Select(weighDropdown);
		weigh1.selectByIndex(Integer.parseInt(prop.getProperty("weigh_dropdown_value")));
		
		WebElement weighSubmitButton = driver.findElement(By.xpath(prop.getProperty("weigh_submit_button")));
		weighSubmitButton.click();
		
		WebElement iframe = driver.findElement(By.xpath(prop.getProperty("i_frame")));
  	        driver.switchTo().frame(iframe);
		
  	    }
		
		public void lengthConversion() {
	    	 
		WebElement mathForEvery1 = driver.findElement(By.linkText(prop.getProperty("math_for_every_one_button")));
		mathForEvery1.click(); 
		
		WebElement length = driver.findElement(By.linkText(prop.getProperty("length_name")));
		length.click();
		
		WebElement lengthInputField= driver.findElement(By.xpath(prop.getProperty("length_input_field")));
		lengthInputField.sendKeys(prop.getProperty("length_input_field_value"));
		
		WebElement lengthDropdown = driver.findElement(By.xpath(prop.getProperty("length_dropdown")));
		Select len = new Select(lengthDropdown);
		len.selectByIndex(Integer.parseInt(prop.getProperty("length_dropdown_value")));
		
		WebElement lengthDropdown1 = driver.findElement(By.xpath(prop.getProperty("length_dropdown_1")));
		Select len1 = new Select(lengthDropdown1);
		len1.selectByVisibleText(prop.getProperty("length_dropdown_1_value"));
		
		WebElement lengthSubmitButton = driver.findElement(By.xpath(prop.getProperty("length_submit_button")));
		lengthSubmitButton.click();
		
		WebElement iframe = driver.findElement(By.xpath(prop.getProperty("i_frame")));
  	        driver.switchTo().frame(iframe);
		
		
		
		}
		
		
		}	
	
	
        
	  
	
	
	
	
	
	
	
	
	


