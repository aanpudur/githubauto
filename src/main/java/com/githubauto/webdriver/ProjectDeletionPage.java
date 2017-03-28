package com.githubauto.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ProjectDeletionPage {
	
	WebDriver driver;

	ProjectDeletionPage(WebDriver driver) {
		this.driver = driver;
	}

	public void loadUrl(String url) {
		driver.get(url);
	}

	public String getTitle() {
		return driver.getTitle();
 }	
	public void clickSettings(){
		driver.findElement(By.xpath("//*[@id='js-repo-pjax-container']/div[1]/div[2]/nav/a[5]")).click();
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(500,300)", "");
	}	
	
	public void clickDelete(){
		driver.findElement(By.cssSelector("button[data-facebox^='#delete_repo']")).click();
		driver.findElement(By.xpath(".//*[@id='facebox']/div/div/form/p/input")).sendKeys("GithubAutomationTraing");
		driver.findElement(By.xpath("//*[@id='facebox']/div/div/form/button")).click();	
	}
	
	
	
	
	
}
