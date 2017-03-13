package com.githubauto.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GithubHomePage {
  
  private static WebDriver driver;
   
  public GithubHomePage(WebDriver driver){
    this.driver = driver;
  }
  
  public void loadUrl(String url){
    driver.get(url);     
  }  
  
   
  public static WebDriver getDriver() {
	return driver;
}

  public void setDriver(WebDriver driver) {
	this.driver = driver;
}

public String getTitle(){
	  return driver.getTitle();	  
  }
  
  public GitHubFeatures gotoFeatures(){
	  driver.findElement(By.linkText("Features")).click();
	  return new GitHubFeatures(driver);	  
  }
  
  public GithubLoginPage gotoSigninPage(){
    driver.findElement(By.linkText("Sign in")).click();;     
    return new GithubLoginPage(driver);   
  }
  
  public GithubExplore gotoExplorePage(){
	    driver.findElement(By.linkText("Explore")).click();  
	    return new GithubExplore(driver);   
	  }
	  
  
  
}
