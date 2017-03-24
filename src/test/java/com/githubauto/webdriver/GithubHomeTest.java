package com.githubauto.webdriver;

import java.util.List;

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
	String feature = "Search · Hibernate · GitHub";

	@Ignore
	public void verifyGithubTitleWithoutLogin() {
		GithubHomePage homepage = new GithubHomePage(driver);
		homepage.loadUrl(url);
		String title = homepage.getTitle();
		Assert.assertEquals(home, title);
		GithubHomePage home = new GithubHomePage(driver);
		home.gotoFeatures();
	}

	@Ignore
	public void GithubFeaturesTest() {
		GitHubFeatures featurePage = new GitHubFeatures(driver);
		String actFeatureTitle = featurePage.getTitle();
		System.out.println(actFeatureTitle);
		Assert.assertEquals(feature, actFeatureTitle);		
	}

	@Test
	public void verifySearchResult() {
		GithubHomePage home = new GithubHomePage(driver);
		home.loadUrl(url);		
		SearchResultsPage resultsPage= home.search("Hibernate");
		String projectTitle = resultsPage.getResult(0).getProjectTitle();
		Assert.assertEquals("vireshmanagooli/hibernate", projectTitle);
		Assert.assertEquals(10, resultsPage.numberOfTitle());
		resultsPage.getSearchResults();
	}
}
