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
	String home = "The world's leading software development platform · GitHub";
	String feature = "Features For Collaborative Coding - Developers Work Better, Together | GitHub · GitHub";
	String explore = "Explore · GitHub";
	
	@Test
	public void verifyGithubTitleWithoutLogin(){		
		 GithubHomePage homepage = new GithubHomePage();
		 homepage.loadUrl(url);
		 
		 String title = homepage.getTitle();
		 System.out.println(title);
		 Assert.assertEquals(home, title);	    
		  }
	
	@Test
	public void GithubFeaturesTest(){		
		
		 GithubHomePage home = new GithubHomePage();
		 home.loadUrl(url);
		 home.gotoFeatures();
				 
		 GitHubFeatures featurePage = new GitHubFeatures();	 		
		 String actFeatureTitle = featurePage.getTitle();
		 System.out.println("feature : " + actFeatureTitle);
		 Assert.assertEquals( feature, actFeatureTitle);	    
		  }	
	

	}
	
	
	
	


