package com.githubauto.webdriver;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Main {
  static String username = "dummyUsername";
  static String password = "dummyPassword";

  public static void main(String[] args) {
    System.setProperty("webdriver.gecko.driver", "/Users/aanvazhapilly/Downloads/geckodriver");     
    WebDriver driver = new FirefoxDriver();
                  
    new GithubHomePage(driver);
    driver.get("https://github.com");
    GithubLoginPage loginPage = new GithubLoginPage(driver);
    driver.get("https://github.com/login");
    loginPage.DoLogin(username, password);
    
  }

}
