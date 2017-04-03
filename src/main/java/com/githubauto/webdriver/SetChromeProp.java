package com.githubauto.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetChromeProp {
	WebDriver driver;

	public void setDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/aanvazhapilly/Downloads/chromedriver");

	}

}
