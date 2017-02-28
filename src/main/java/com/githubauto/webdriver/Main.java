package com.githubauto.webdriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
  static String username = "dummyusername";
  static String password = "dummypassword";

  public static void main(String[] args) {
    
    System.setProperty("webdriver.chrome.driver", "/Users/aanvazhapilly/Downloads/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                 
    GithubHomePage home = new GithubHomePage(driver); 
    GithubLoginPage loginPage = home.DoSignin();
    loginPage.DoLogin(username, password);   
  }

}
