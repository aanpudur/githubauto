package com.githubauto.webdriver;

import org.openqa.selenium.WebDriver;

public class GithubExplore {
	
	private WebDriver driver;

	public GithubExplore(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getTitle(){
		return driver.getTitle();		
	}
}
