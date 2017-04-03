package com.githubauto.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverBuilder {
	private static WebDriver webDriver = null;

	private DriverBuilder() {
	}

	public static WebDriver getDriver() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/aanvazhapilly/Downloads/chromedriver");
		WebDriver webDriver = new ChromeDriver();
		return webDriver;
		/*
		
		String requestedBrowser = System.getProperty("browser");
		if (webDriver == null) {			
			if("chrome".equals(requestedBrowser))
			webDriver = newChromeDriver();
		}else if("ff".equals(requestedBrowser)){
			
			webDriver = newFireFoxDriver();
		}else {
			webDriver = newChromeDriver();
		}
		return webDriver;
		}
	

	private static WebDriver newChromeDriver(){
		
		System.setProperty("webdriver.chrome.driver", "/Users/aanvazhapilly/Downloads/chromedriver");
		webDriver = new ChromeDriver();
		return webDriver;
		
	}
	
	private static WebDriver newFireFoxDriver(){
		System.setProperty("webdriver.gecko.driver", "/Users/aanvazhapilly/Downloads/geckodriver");

		//System.setProperty("webdriver.gecko.driver", "/Users/aanvazhapilly/Downloads/geckodriver");
		//System.setProperty(
		 webDriver = new FirefoxDriver();
		 webDriver.manage().timeouts().pageLodTimeout(30, TimeUnit.SECONDS);
		 webDriver.manage().timeouts().implicatityWait(500, TimeUnit.MILLISECONDS);
		return webDriver;
	}*/

}
}
