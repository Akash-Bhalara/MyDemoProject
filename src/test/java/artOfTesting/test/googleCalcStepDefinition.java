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
		 System.setProperty("webdriver.chrome.driver","D:\\Workspace\\MyDemoProject\\chromedriver.exe"); 
	        driver = new ChromeDriver();
	}
	 @Given("^open google url\"([^\"]*)\"$")
	 public void open_google_url(String arg1) throws Throwable {
		//Set implicit wait of 10 seconds and launch google
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get(arg1);
	 }

	 @When("^enter details\"([^\"]*)\"in text box$")
	 public void enter_details_in_text_box(String arg1) throws Throwable {
		 	WebElement e= driver.findElement(By.xpath("//INPUT[@class='gLFyf gsfi']"));
			e.click();
			e.sendKeys(arg1);
	 }

	 @Then("^result\"([^\"]*)\"should be displayed in box$")
	 public void result_should_be_displayed_in_box(String arg1) throws Throwable {
		  	//Get result from calculator
					WebElement e = driver.findElement(By.xpath("//DIV[@class='cwtlotc']"));
					String matchString = e.getText();
					Thread.sleep(5000);	
					//Verify that result of 2+2 is 4
					Assert.assertTrue(matchString.contains(arg1));
					driver.close();
	 }

	    @When("^hit on enter key$")
	    public void hit_on_enter_key() throws Throwable {
	    	WebElement e= driver.findElement(By.xpath("//INPUT[@class='gLFyf gsfi']"));
	    	Thread.sleep(5000);
			e.sendKeys(Keys.ENTER);
	    }
	    
	  
	   
	 @After
	    public void closeBrowser() {
	        driver.quit();
	 }

}


