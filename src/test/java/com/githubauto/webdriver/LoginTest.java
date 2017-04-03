package com.githubauto.webdriver;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginTest {

	public WebDriver driver;

	public LoginTest() {
		driver = DriverBuilder.getDriver();
	}

	static String username = "wipauto123";
	//wipauto123 (username)
	static String password = "Github123$";
	static String url = "http://www.github.com";

	@Ignore
	public void login() {
		GithubHomePage home = new GithubHomePage(driver);
		home.loadUrl(url);
		GithubLoginPage loginPage = home.gotoSigninPage();
		GithubUsrHomepage userHome =  loginPage.login(username, password);
		
	}
}