package com.githubauto.webdriver;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import sun.net.NetworkServer;


/*1. create a webdriver
 * 2. Create a HithubHOmepage isntance and pass driver to it
 * 3. GithubHome page Lad > will load githun home page
 * 4. Gothubt
*/

public class GithubHomeTest {
	
	String url = "https://github.com/";
	String expectedTitle = "The world's leading software development platform · GitHub";
	String expFeatureTitle = "Features For Collaborative Coding - Developers Work Better, Together | "
			+ "GitHub · GitHub";
	String exploreTitle = "Features For Collaborative Coding - Developers Work Better, Together | GitHub · GitHub";
	
	@Test
	public void verifyGithubTitleWithoutLogin(){	
		//System.setProperty("webdriver.chrome.driver", "/Users/aanvazhapilly/Downloads/chromedriver");
		 SetChromeProp chrome = new SetChromeProp();	
		 chrome.setDriver();
		 WebDriver driver  = new ChromeDriver();
		
		 GithubHomePage homepage = new GithubHomePage(driver);
		 homepage.loadUrl(url);
		 String title = homepage.getTitle();
		 Assert.assertEquals(expectedTitle, title);	    
		  }
	
	@Test
	public void GithubFeaturesTest(){		
		 //System.setProperty("webdriver.chrome.driver", "/Users/aanvazhapilly/Downloads/chromedriver");
		 SetChromeProp chrome = new SetChromeProp();	
		 chrome.setDriver();
		 WebDriver driver = new ChromeDriver();
		 
		 GithubHomePage home = new GithubHomePage(driver);
		 home.loadUrl(url);
		 home.gotoFeatures();
				 
		 GitHubFeatures featurePage = new GitHubFeatures(driver);	 		
		 String actFeatureTitle = featurePage.getTitle();
		 Assert.assertEquals(expFeatureTitle, actFeatureTitle);	    
		  }	
	
	@Test
	public void explorePageTest(){		
		 //System.setProperty("webdriver.chrome.driver", "/Users/aanvazhapilly/Downloads/chromedriver");
		 SetChromeProp chrome = new SetChromeProp();	
		 chrome.setDriver();
		 WebDriver driver = new ChromeDriver();
		 
		 GithubHomePage home = new GithubHomePage(driver);
		 home.loadUrl(url);
		 home.gotoFeatures();
				 
		 GitHubFeatures featurePage = new GitHubFeatures(driver);	 		
		 String actExploreTitle = featurePage.getTitle();
		 Assert.assertEquals(exploreTitle, actExploreTitle);	    
		  }	
	}
	
	
	
	


