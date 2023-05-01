package com.webmath.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.webmath.base.TestBase;

public class AlgebraPage extends TestBase {
	
	WebDriver driver;

	  
    public AlgebraPage(WebDriver driver){
	this.driver = driver;
    }

    public void squareRootsSimplification() {
	
    	        WebElement algebra = driver.findElement(By.linkText(prop.getProperty("algebra_1")));
		algebra.click();
		
		WebElement squareRoots = driver.findElement(By.linkText(prop.getProperty("square_Roots")));
		squareRoots.click();
		
		WebElement squareRootsTextBox = driver.findElement(By.name(prop.getProperty("square_Roots_Text_Box")));
		squareRootsTextBox.sendKeys(prop.getProperty("squareRootsTextBox_value"));
		
		
		WebElement simplifyButton = driver.findElement(By.xpath(prop.getProperty("simplify_Button")));
		simplifyButton.click();
	    
		WebElement iframe = driver.findElement(By.xpath(prop.getProperty("i_frame")));
  	        driver.switchTo().frame(iframe);
	
	
    }	

}
