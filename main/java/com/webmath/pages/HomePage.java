package com.webmath.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



import com.webmath.base.TestBase;

public class HomePage extends TestBase {

    WebDriver driver;
	
	public HomePage(WebDriver driver){
      this.driver= driver;
	}
	
	public String validateHomePageTitle() {
	   return driver.getTitle();
	}
	
	public boolean validateWebmathLogo() {
	    return driver.findElement(By.xpath(prop.getProperty("webmath_logo"))).isDisplayed();
	}
	 
	public void mathForEveryOneLink() {
		driver.findElement(By.linkText(prop.getProperty("math_for_everyone_locator1"))).click();
	
	
	}
	

}
