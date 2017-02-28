package com.githubauto.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Main {
  static String username = "aanpudur@gmail.com";
  static String password = "#Rosyma1";

  public static void main(String[] args) {
    
    System.setProperty("webdriver.chrome.driver", "/Users/aanvazhapilly/Downloads/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                  
    GithubHomePage home = new GithubHomePage(driver);
    home.DoSignin();
    
    GithubLoginPage loginPage = new GithubLoginPage(driver);
    loginPage.DoLogin(username, password);
    
    
  }

}
