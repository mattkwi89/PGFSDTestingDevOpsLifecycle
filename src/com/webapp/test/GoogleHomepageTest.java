package com.webapp.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GoogleHomepageTest {

	public static void main(String[] args) {
		
		
		//step 1: Formulate a test url
		String siteUrl = "https://www.google.com/";
		String driverPath = "drivers/chromedriver.exe";
		
		//step 2: Setting selenium system property
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		//step 3: Initiate selenium webdriver
		WebDriver driver = new ChromeDriver();
		
		//step 4: Launch web browser
		
		driver.get(siteUrl);
		
		//step 5: Evaluate test

	}

}
