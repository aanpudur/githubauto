package com.githubauto.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GithubHomePage {

	WebDriver driver;

	GithubHomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void loadUrl(String url) {
		driver.get(url);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public GitHubFeatures gotoFeatures() {
		driver.findElement(By.linkText("Features")).click();
		return new GitHubFeatures(driver);
	}

	public GithubLoginPage gotoSigninPage() {
		driver.findElement(By.linkText("Sign in")).click();
		return new GithubLoginPage(driver);
	}

	public SearchResultsPage search(String input) {
		WebElement searchInput = driver.findElement(By.name("q"));
		searchInput.sendKeys(input);
		searchInput.click();
		searchInput.sendKeys(Keys.ENTER);
		return new SearchResultsPage(driver);
	}

}
