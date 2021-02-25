package com.qa.shoppingweb.test.cuke.stepdefs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SeleniumWebDriver {

	private static RemoteWebDriver driver;
	
	@Before
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Tests have Started");
	}

	@After
	public static void cleanUp() {
		driver.quit();
		System.out.println("The driver has been closed!");
	}
	
	public static RemoteWebDriver getDriver() {
		return driver;
	}
	
}
