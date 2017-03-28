package com.githubauto.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewProjectPage {
	WebDriver driver;

	NewProjectPage(WebDriver driver) {
		this.driver = driver;
	}

	public void loadUrl(String url) {
		driver.get(url);
	}

	public String getTitle() {
		return driver.getTitle();
}
	public void addingProjectNameAndDescription(String name, String description){
		driver.findElement(By.cssSelector("#repository_name")).sendKeys(name);
		driver.findElement(By.cssSelector("#repository_description")).sendKeys(description);
		driver.findElement(By.cssSelector("button[data-disable-with*='repository']")).click();
	}	
	
	public ProjectDeletionPage clickingRepository(){
		driver.findElement(By.cssSelector(".repo")).click();
		return new ProjectDeletionPage(driver);
	}

}
