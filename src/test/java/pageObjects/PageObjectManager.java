package pageObjects;

import org.openqa.selenium.WebDriver;


// this is the factory where we will create all the objects for all the pageobjects files
public class PageObjectManager {
	public checkOutFormPage checkOutFormPage;
	public ThanksPage ThanksPage;
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver){
		this.driver = driver;
	}
	
	
    public checkOutFormPage getCheckOutFormPage() {
        return (checkOutFormPage == null) ? checkOutFormPage = new checkOutFormPage(driver) : checkOutFormPage;
    }
    public ThanksPage getThanksPage() {
        return (ThanksPage == null) ? ThanksPage = new ThanksPage(driver) : ThanksPage;
    }
} 
