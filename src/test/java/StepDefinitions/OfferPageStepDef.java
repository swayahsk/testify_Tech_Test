package StepDefinitions;

import io.cucumber.java.en.*;
import pageObjects.LandingPage;
import pageObjects.OfferingPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPageStepDef {
	public WebDriver driver;
	
	public String landingPageproductName;
	public String offerPageProductName;
	TestContextSetup TestContextSetup;
	PageObjectManager pageObjectManager;
	
	public OfferPageStepDef(TestContextSetup TestContextSetup) {
		this.TestContextSetup=TestContextSetup;
	}
	
	//handling windows (parent child)
	@Then("user searched for {string} shortname in offers page")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_exist(String shortName) throws InterruptedException {
		
		OfferingPage offeringPage=new OfferingPage(TestContextSetup.driver);
		
		switchToOfferPage();
		Thread.sleep(2000);
		offeringPage.searchItem(shortName);
		Thread.sleep(2000);
		offerPageProductName = offeringPage.getProductName();
	}
	
	
	public void switchToOfferPage() {
		OfferingPage offeringPage=TestContextSetup.pageObjectManager.getOffersPage();
		//OfferingPage offeringPage=new OfferingPage(testContextSetup.driver);
		
		//if already switched (deja dans offre page) => do not execute this => skip it*
		//if (testContextSetup.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers"));
		
		offeringPage.openLink(landingPageproductName); //click on link
		TestContextSetup.genericUtils.pointerOnTheChildWindow();//change to child window 
	}
	
	@Then("check if the product name is the same in offer page and landling page")
	public void check_if_the_product_name_is_the_same_in_offer_page_and_landling_page() {
		Assert.assertEquals(offerPageProductName , TestContextSetup.landingPageproductName );

	}


}
