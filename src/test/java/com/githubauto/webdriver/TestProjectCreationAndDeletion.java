package com.githubauto.webdriver;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestProjectCreationAndDeletion {
	
	public WebDriver driver;

	public TestProjectCreationAndDeletion() {
		driver = DriverBuilder.getDriver();
	}

	static String username = "gtestsatyam";
	static String password = "satyam123$";
	static String url = "http://www.github.com";
	String expectedTitle = "Create a New Repository";
	
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
	@Test
	public void testDeletingProject(){
		driver.manage().deleteAllCookies();
		driver.manage().deleteAllCookies();
		GithubHomePage home = new GithubHomePage(driver);
		home.loadUrl(url);
		GithubLoginPage loginPage = home.gotoSigninPage();
		GithubUsrHomepage userHome =  loginPage.login(username, password);
		NewProjectPage nPage = new NewProjectPage(driver);
		ProjectDeletionPage deleteRepository = nPage.clickingRepository();
		deleteRepository.clickSettings();
		deleteRepository.clickDelete();	
	}
	
}
