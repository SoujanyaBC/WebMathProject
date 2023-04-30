 package com.webmath.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	  public static WebDriver driver;
	  public static Properties prop;
	
	public TestBase() {
	
	 FileInputStream ip;
	try {
		ip = new FileInputStream("G:\\ExcelR\\SELENIUM\\WebMathTest\\src\\main\\java\\com\\webmath\\config\\config.properties");
	    prop = new Properties();
	    prop.load(ip);
	
	} catch (FileNotFoundException e) {
	e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	}
	public static void initialize() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
		     driver = new ChromeDriver(co);
		}
		else if(browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
		     driver = new EdgeDriver();}
	
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(prop.getProperty("url"));
    
	    }   
        }

