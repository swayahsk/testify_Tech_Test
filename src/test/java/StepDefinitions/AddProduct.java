package StepDefinitions;

import io.cucumber.java.en.*;
import pageObjects.AddProductObj;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;
import utils.TestBase;
import utils.TestContextSetup;

import org.openqa.selenium.chrome.*;
import org.testng.Assert;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class AddProduct {
	
	
	public WebDriver driver;
	public String landingPageproductName;
	public String offerPageProductName;
	TestContextSetup TestContextSetup;
	PageObjectManager pageObjectManager;
	TestBase testBase;
	public String addProductName;
	public AddProductObj AddProductObj;
	
	
	// Single responsibility Principle
	// loosly coupled
	//Factory Design Pattern
	
	public AddProduct(TestContextSetup TestContextSetup) {
		this.TestContextSetup=TestContextSetup;
		this.AddProductObj = TestContextSetup.pageObjectManager.getAddPageObj();
	}

	@When("^user add (.+) units$")
	public void user_add_three_units(int howMany) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions

		
		Thread.sleep(2000);
		AddProductObj.addItem(howMany);
	}
	@Then("User go to the cart")
	public void user_go_to_the_cart() {
		
		AddProductObj.addToCart();
		AddProductObj.goToCart();

		
	}
	@Then("^check if the product name is added in the cart with the same (.+)$")
	public void check_if_the_product_name_is_added_in_the_cart_with_the_same_tom(String shortName) {
	    // Write code here that turns the phrase above into concrete actions
		
		addProductName = AddProductObj.getProductName().split("-")[0].trim();;
		Assert.assertEquals(addProductName , TestContextSetup.landingPageproductName );
		AddProductObj.proceedToCheckout();
		
	}


}
