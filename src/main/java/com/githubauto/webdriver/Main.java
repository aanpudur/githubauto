package com.githubauto.webdriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	static WebDriver driver;

	Main(WebDriver driver) {
		this.driver = driver;
	}

	static String username = "dummyUsername";
	static String password = "DummyPassword";
	static String url = "http://www.github.com";

	public static void main(String[] args) {

		GithubHomePage home = new GithubHomePage(driver);
		home.loadUrl(url);
		GithubLoginPage loginPage = home.gotoSigninPage();
		loginPage.login(username, password);
	}

}
