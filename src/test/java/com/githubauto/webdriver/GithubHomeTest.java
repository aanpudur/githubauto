package com.githubauto.webdriver;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class GithubHomeTest {

	public WebDriver driver;

	public GithubHomeTest() {
		driver = DriverBuilder.getDriver();
	}

	String url = "https://github.com/";
	String home = "The world's leading software development platform · GitHub";
	String feature = "Features For Collaborative Coding - Developers Work Better, Together | GitHub · GitHub";
	
	@Ignore
	public void verifyGithubTitleWithoutLogin() {
		GithubHomePage homepage = new GithubHomePage(driver);
		homepage.loadUrl(url);

		String title = homepage.getTitle();
		System.out.println(title);
		Assert.assertEquals(home, title);
	}
	
	@Ignore
	public void GithubFeaturesTest() {
		GithubHomePage home = new GithubHomePage(driver);
		home.loadUrl(url);
		home.gotoFeatures();

		GitHubFeatures featurePage = new GitHubFeatures(driver);
		String actFeatureTitle = featurePage.getTitle();
		Assert.assertEquals(feature, actFeatureTitle);
	}
	@Test
	public void verifySeachReaults(){
		GithubHomePage home = new GithubHomePage(driver);
		home.loadUrl(url);
		SearchPage page = new SearchPage(driver);
		page.search("hibernate");
		page.numberOfTitles();
		page.getSearchResults();
		
						
	}
	
}
