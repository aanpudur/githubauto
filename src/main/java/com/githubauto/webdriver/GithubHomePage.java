package com.githubauto.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GithubHomePage extends DriverBuilder{
	
  public void loadUrl(String url){
    driver.get(url);     
  }  
  
  public String getTitle() {
		return driver.getTitle();
	}
  
  public GitHubFeatures gotoFeatures(){
	  driver.findElement(By.linkText("Features")).click();
	  return new GitHubFeatures();	  
  }
  
  public GithubLoginPage gotoSigninPage(){
    driver.findElement(By.linkText("Sign in")).click();;     
    return new GithubLoginPage();   
  }
  
  


	  
  
  
}
