package com.githubauto.webdriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage {
	
	private static final By TEXT_LOCATOR = By.tagName("h3");
	private static final By RESULT_LOCATOR = By.cssSelector("div[class^='repo-list-item']");
	//div[class$='codesearch-results pr-6']
	//div.codesearch-results li
	
	private final WebDriver driver;

	public SearchResultsPage(WebDriver driver) {
		this.driver = driver;
	}

	public int numberOfTitle() {
		List<WebElement> resultList = driver
				.findElements(RESULT_LOCATOR);
		System.out.println("Number of search results are: " + resultList.size());
		System.out.println("*************************************");
		return resultList.size();
	}

	public List<String> getSearchResults() {
		List<WebElement> resultList = driver
				.findElements(RESULT_LOCATOR);
		List<String> titles = new ArrayList<>();
		

		for (WebElement element : resultList) {
			String  title = element.findElement(TEXT_LOCATOR).getText();
			titles.add(title);
			System.out.println(title);
		}
		return titles;
	}
	
	public Result getResult(int index){
		WebElement resultele = driver.findElements(RESULT_LOCATOR).get(index);
		return new Result(resultele);		
	}
	
	//inner class
	public static class Result{
		
		WebElement resultele;
		
		public Result(WebElement resultele) {
			this.resultele = resultele;
		}
		
		public String getProjectTitle(){
		return resultele.findElement(TEXT_LOCATOR).getText();
			
		}
		
	}
	
}
