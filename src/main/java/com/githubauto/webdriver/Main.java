package com.githubauto.webdriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
  static String username = "dummyUsername";
  static String password = "DummyPassword";
  static String url ="http://www.github.com";

  public static void main(String[] args) {
    
    System.setProperty("webdriver.chrome.driver", "/Users/aanvazhapilly/Downloads/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                 
    GithubHomePage home = new GithubHomePage(driver); 
    home.loadUrl(url);
    GithubLoginPage loginPage = home.gotoSigninPage();
    loginPage.login(username, password);   
  }

}
