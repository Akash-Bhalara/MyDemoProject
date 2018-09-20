package artOfTesting.test;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class googleCalcStepDefinition {
	
	
	protected WebDriver driver;
	
	 @Before
	    public void setup() {
		 System.setProperty("webdriver.chrome.driver","E:\\MyXrayDemoWorkSpace\\cucumberJava1\\cucumberJava\\chromedriver.exe"); 
	        driver = new ChromeDriver();
	}
		
	@Given("^I open google$")
	public void I_open_google() {
		//Set implicit wait of 10 seconds and launch google
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in");
	}
	
	@When("^I enter \"([^\"]*)\" in search textbox$")
	public void I_enter_in_search_textbox(String additionTerms) throws InterruptedException {
		WebElement e= driver.findElement(By.xpath("//INPUT[@id='lst-ib']"));
		e.click();
		e.sendKeys(additionTerms);
		//Write term in google textbox
		Thread.sleep(5000);
		e.sendKeys(Keys.ENTER);
	}
	
	@Then("^I should get result as \"([^\"]*)\"$")
	public void I_should_get_correct_result(String expectedResult) throws InterruptedException {
		//Get result from calculator
		WebElement e = driver.findElement(By.xpath("//DIV[@class='cwtlotc']"));
		String matchString = e.getText();
		Thread.sleep(5000);	
		//Verify that result of 2+2 is 4
		Assert.assertTrue(matchString.contains("4"));
		driver.close();
	}
	
	 @After
	    public void closeBrowser() {
	        driver.quit();
	 }

}


