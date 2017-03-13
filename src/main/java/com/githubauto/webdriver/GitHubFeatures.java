package com.githubauto.webdriver;

import org.openqa.selenium.WebDriver;



public class GitHubFeatures {
	
	private WebDriver driver;

	public GitHubFeatures(WebDriver driver) {
		this.driver = driver;
	}
	
	 public void loadUrl(String url){
		    driver.get(url);     
		  }

	public String getTitle() {
		return driver.getTitle();
	}  
		  
	
  

}
