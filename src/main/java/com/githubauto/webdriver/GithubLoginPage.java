package com.githubauto.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GithubLoginPage {
 private WebDriver driver = null;
  
  public GithubLoginPage(WebDriver driver){
    this.driver = driver;        
  }
  
  public void DoLogin(String username, String password){
    driver.findElement(By.name("login")).sendKeys(username);
    driver.findElement(By.name("password")).sendKeys(password);
    driver.findElement(By.name("commit")).click();             
  }

}
