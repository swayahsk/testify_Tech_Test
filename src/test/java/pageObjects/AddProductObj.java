package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProductObj {
	public WebDriver driver;
	
	public AddProductObj(WebDriver driver) {
		this.driver=driver; //activate the driver declared with the real driver
		
	}
	
	private By add =By.xpath("//a[normalize-space()='+']");
	private By cart = By.xpath("//button[normalize-space()='ADD TO CART']");
	private By panier = By.xpath("//img[@alt='Cart']");
	private By productName = By.xpath("//div[@class='cart-preview active']//div//div//p[@class='product-name'][normalize-space()='Tomato - 1 Kg']");
	private By ProceedToChekout = By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']");
	public void addItem() {
	    for (int i = 0; i < 3; i++) {
	        driver.findElement(add).click();
	    }
	}
	public void addToCart() {    
	        driver.findElement(cart).click();  
	}
	public void goToCart() {    
        driver.findElement(panier).click();
    }
	public String getProductName() {
		
		return driver.findElement(productName).getText();
	}
	public void proceedToCheckout() {
		
		driver.findElement(ProceedToChekout).click();	
		}
	
}
