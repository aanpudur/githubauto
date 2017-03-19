package com.githubauto.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	WebDriver driver;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}

	public void loadUrl(String url) {
		driver.get(url);
	}

	public SearchResults search(String input) {
		WebElement searchInput = driver.findElement(By.name("q"));
		searchInput.sendKeys(input);
		searchInput.click();
		searchInput.sendKeys(Keys.ENTER);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new SearchResults();
	}

	public void numberOfTitles() {
		List<WebElement> resultList = driver
				.findElements(By.xpath("//*[@id='js-pjax-container']/div[2]/div/div[2]/ul/li[*]"));
		System.out.println("Number of search results are: " + resultList.size());
		System.out.println("*************************************");
	}

	public void getSearchResults() {
		List<WebElement> resultList = driver
				.findElements(By.xpath("//*[@id='js-pjax-container']/div[2]/div/div[2]/ul/li[*]"));
		
		for (WebElement element : resultList) {
			System.out.println(element.findElement(By.tagName("h3")).getText());
		}
	}
}
