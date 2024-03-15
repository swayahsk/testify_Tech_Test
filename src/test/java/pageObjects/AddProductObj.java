package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProductObj {
	public WebDriver driver;
	
	public AddProductObj(WebDriver driver) {
		this.driver=driver; //activate the driver declared with the real driver
		
	}
	
	private By add =By.xpath("//a[normalize-space()='+']");
	//private By productName = By.xpath("//h4[normalize-space()='Tomato - 1 Kg']");
	
	public void addItem() {
		
		driver.findElement(add).click();
	}
}
