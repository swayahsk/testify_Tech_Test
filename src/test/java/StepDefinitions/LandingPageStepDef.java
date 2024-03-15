package StepDefinitions;

import io.cucumber.java.en.*;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;
import utils.TestBase;
import utils.TestContextSetup;

import org.openqa.selenium.chrome.*;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class LandingPageStepDef {
	
	public WebDriver driver;
	public String landingPageproductName;
	public String offerPageProductName;
	TestContextSetup TestContextSetup;
	PageObjectManager pageObjectManager;
	TestBase testBase;
	
	// Single responsibility Principle
	// loosly coupled
	//Factory Design Pattern
	
	public LandingPageStepDef(TestContextSetup TestContextSetup) {
		this.TestContextSetup=TestContextSetup;
	}
	@Given("user is on GreenCard Landing page")
	public void user_is_on_green_card_landing_page() throws IOException {
		TestContextSetup.testBase.WebDriverManager();
//		System.setProperty("webdriver.chrome.driver", "C:/Users/skand/Downloads/chromedriver-win64/chromedriver.exe");
//		TestContextSetup.driver = new ChromeDriver(); //driver gets the life
//		this.TestContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}
	
	
	@When("^user searched with shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName) {
		
		//pageObjectManager = new PageObjectManager(TestContextSetup.driver);
		// j'ai remplacer le pageObjectManager from the PageObjectManager(file) j'ai le remplcé avec le pageObjectManager from TestContextSetup, pour evité le usage de "new"
		LandingPage landingPage=TestContextSetup.pageObjectManager.getLandingPage();
		
		landingPage.searchItem(shortName);
		TestContextSetup.landingPageproductName = landingPage.getProductName().split("-")[0].trim();
		System.out.println(landingPageproductName + "  is extractes");
	}
	
 


}
