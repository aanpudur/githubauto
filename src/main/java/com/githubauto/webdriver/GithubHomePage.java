package com.githubauto.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GithubHomePage {
  
  private WebDriver driver;
   
  public GithubHomePage(WebDriver driver){
    this.driver = driver;
  }
  
  public void loadUrl(String url){
    driver.get(url);     
  }  
  
  public GithubLoginPage gotoSigninPage(){
    driver.findElement(By.linkText("Sign in")).click();;     
    return new GithubLoginPage(driver);   
  }
}
