package com.githubauto.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GithubUsrHomepage {
	
	WebDriver driver;

	GithubUsrHomepage(WebDriver driver) {
		this.driver = driver;
	}

	public void loadUrl(String url) {
		driver.get(url);
	}

	public String getTitle() {
		return driver.getTitle();

}
	
	public boolean locateStartButton(){
		
		boolean buttonDisplayed = driver.findElement(By.cssSelector(".btn.shelf-cta.ml-3")).isDisplayed();
		if(buttonDisplayed==true){
			System.out.println("pass");
		}
		return buttonDisplayed;
	}
	
	public NewProjectPage  gotoCreatingProjectPage(){
		if(locateStartButton() == true){
			driver.findElement(By.cssSelector(".btn.shelf-cta.ml-3")).click();		
		}
		return new NewProjectPage(driver);
		
	}

}