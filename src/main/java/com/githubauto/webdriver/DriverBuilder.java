package com.githubauto.webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverBuilder {	
	public static WebDriver driver = null;

	   public static WebDriver getDriver() {
	      if(driver == null) {
	    	  System.setProperty("webdriver.chrome.driver", "/Users/aanvazhapilly/Downloads/chromedriver");
	         driver = new ChromeDriver();
	      }
	      return driver;
	   }
	   
}
