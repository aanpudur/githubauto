package com.githubauto.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage {
	WebDriver driver;

	public SearchResultsPage(WebDriver driver) {
		this.driver = driver;
	}

	public void loadUrl(String url) {
		driver.get(url);
	}

	public void numberOfTitle() {
		List<WebElement> resultList = driver
				.findElements(By.xpath("//*[@id='js-pjax-container']/div[2]/div/div[2]/ul/li[*]"));
		System.out.println("Number of search results are: " + resultList.size());
		System.out.println("*************************************");
	}

	public List<WebElement> getSearchResults() {
		List<WebElement> resultList = driver
				.findElements(By.xpath("//*[@id='js-pjax-container']/div[2]/div/div[2]/ul/li[*]"));

		for (WebElement element : resultList) {
			System.out.println(element.findElement(By.tagName("h3")).getText());
		}
		return resultList;
	}
}
