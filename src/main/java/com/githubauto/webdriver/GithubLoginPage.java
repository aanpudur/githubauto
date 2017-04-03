package com.githubauto.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GithubLoginPage {

	WebDriver driver;

	public GithubLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void loadUrl(String url) {
		driver.get(url);
	}

	public GithubUsrHomepage login(String username, String password) {
		driver.findElement(By.name("login")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("commit")).click();
		return new GithubUsrHomepage(driver);
	}
}
