package com.githubauto.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GithubHomePage {
  
  private WebDriver driver = null;
  
  
  public GithubHomePage(WebDriver driver){
    
    this.driver = driver;
  }

  public GithubLoginPage DoSignin(){
    driver.findElement(By.linkText("Sign in"));   
    return new GithubLoginPage(driver);
    
  }
}
