package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver=driver; //activate the driver declared with the real driver
		System.out.println(driver);
	}
	
	private By search =By.xpath("//input[@type='search']");
	private By productName = By.xpath("//h4[normalize-space()='Tomato - 1 Kg']");
	
	public void searchItem(String name) {
		
		driver.findElement(search).sendKeys(name);
	}
	public void getSearchText(String name) {
		
		driver.findElement(search).getText();
	}
	public String getProductName() {
		
		return driver.findElement(productName).getText();
	}
}
