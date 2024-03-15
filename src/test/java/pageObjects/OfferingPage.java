package pageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferingPage {
	public WebDriver driver;
	
	public OfferingPage(WebDriver driver) {
		this.driver=driver;
		System.out.println(driver);
	}
	
	private By search =By.xpath("//input[@type='search']");
	private By link = By.linkText("Top Deals");
	private By productName = By.cssSelector("tr td:nth-child(1)");
	
	public void openLink(String name) {
		
		driver.findElement(link).click();
	}
	
	public void searchItem(String name) {
		
	    if (driver != null) {
	    	driver.findElement(search).sendKeys(name);
	    } else {
	        System.out.println("WebDriver is not initialized. Cannot perform search.");
	    }
	}

	public String getProductName() {
		return driver.findElement(productName).getText();
		
	} 

}
