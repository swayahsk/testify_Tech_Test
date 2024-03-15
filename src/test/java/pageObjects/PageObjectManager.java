package pageObjects;

import org.openqa.selenium.WebDriver;


// this is the factory where we will create all the objects for all the pageobjects files
public class PageObjectManager {
	public LandingPage landingPage;
	public OfferingPage OfferingPage;
	public AddProductObj AddProductObj;
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver){
		this.driver = driver;
	}
	
	
	public LandingPage getLandingPage() {
	
		landingPage= new LandingPage(driver);
		return landingPage;
	}
	
	public OfferingPage getOffersPage() {
		OfferingPage = new OfferingPage(driver);
		return OfferingPage;
	}
	
	public AddProductObj getAddPageObj() {
		AddProductObj = new AddProductObj(driver);
		return AddProductObj;
	}
} 
