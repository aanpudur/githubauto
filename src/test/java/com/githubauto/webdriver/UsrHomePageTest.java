package com.githubauto.webdriver;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class UsrHomePageTest {

	public WebDriver driver;

	public UsrHomePageTest() {
		driver = DriverBuilder.getDriver();
	}

	static String username = "gtestsatyam";
	//wipauto123 (username)
	static String password = "satyam123$";
	static String url = "http://www.github.com";
	String expectedTitle = "Create a New Repository";
	private GithubUsrHomepage userHome;
		
	@Test
	public void login() {
		driver.manage().deleteAllCookies();
		GithubHomePage home = new GithubHomePage(driver);
		//driver.manage().window().maximize();
		home.loadUrl(url);
		GithubLoginPage loginPage = home.gotoSigninPage();
		 userHome =  loginPage.login(username, password);		
	}
	
	@Ignore
	public void verifyStartButtonExists(){
		driver.manage().deleteAllCookies();
		GithubHomePage home = new GithubHomePage(driver);
		home.loadUrl(url);
		GithubLoginPage loginPage = home.gotoSigninPage();
		GithubUsrHomepage userHome =  loginPage.login(username, password);
		userHome.locateStartButton();	
	}
	
	@Ignore
	public void testGoingtoNewProjectPage(){
		driver.manage().deleteAllCookies();
		GithubHomePage home = new GithubHomePage(driver);
		home.loadUrl(url);
		GithubLoginPage loginPage = home.gotoSigninPage();
		GithubUsrHomepage userHome =  loginPage.login(username, password);
		userHome.gotoCreatingProjectPage();	
		String actualTitle = userHome.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	@Ignore
	public void testCreatingProject(){
		driver.manage().deleteAllCookies();
		GithubHomePage home = new GithubHomePage(driver);
		home.loadUrl(url);
		GithubLoginPage loginPage = home.gotoSigninPage();
		GithubUsrHomepage userHome =  loginPage.login(username, password);
		NewProjectPage projectPage = userHome.gotoCreatingProjectPage();
		projectPage.addingProjectNameAndDescription("GithubAutomationTraing", "Automation Training");		
	}
	
	@Ignore
	public void testDeletingProject(){
		driver.manage().deleteAllCookies();
		GithubHomePage home = new GithubHomePage(driver);
		home.loadUrl(url);
		GithubLoginPage loginPage = home.gotoSigninPage();
		GithubUsrHomepage userHome =  loginPage.login(username, password);
		
	}
	
}