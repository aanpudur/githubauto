package com.githubauto.webdriver;

import org.openqa.selenium.WebDriver;

public class GitHubFeatures extends DriverBuilder {

	 public void loadUrl(String url){
		    driver.get(url);     
		  }

	public String getTitle() {
		return driver.getTitle();
	}  
}
