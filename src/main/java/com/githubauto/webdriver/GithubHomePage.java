package com.githubauto.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GithubHomePage{
	
  WebDriver driver;
  GithubHomePage(WebDriver driver) {
	  this.driver=driver;
  }
	
  public void loadUrl(String url){
    driver.get(url);     
  }  
  
  public String getTitle() {
		return driver.getTitle();
	}
  
  public GitHubFeatures gotoFeatures(){
	  driver.findElement(By.linkText("Features")).click();
	  return new GitHubFeatures(driver);	  
  }
  
  public GithubLoginPage gotoSigninPage(){
    driver.findElement(By.linkText("Sign in")).click();;     
    return new GithubLoginPage();   
  } 
}
