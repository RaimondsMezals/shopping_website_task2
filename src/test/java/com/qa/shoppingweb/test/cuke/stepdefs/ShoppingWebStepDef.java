package com.qa.shoppingweb.test.cuke.stepdefs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingWebStepDef {

	private static RemoteWebDriver driver;
	private static WebElement targ;


	@Given("I can access automationpractice.com\\/index.php")
	public void i_can_access_automationpractice_com_index_php() {
		driver = SeleniumWebDriver.getDriver();
		driver.get("http://automationpractice.com/index.php");
	}

	@When("I Seatch for a dress")
	public void i_seatch_for_a_dress() {
		targ = driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
		targ.sendKeys("Dress");
		targ = driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button"));
		targ.click();
	}

	@Then("I should see a Printed Summer Dress")
	public void i_should_see_a_printed_summer_dress() {
		targ = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a"));
		String result = targ.getText();
		assertEquals("Printed Summer Dress", result);
	}

}
