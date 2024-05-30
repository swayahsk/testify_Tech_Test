package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;


public class checkOutFormPage {
	public WebDriver driver;
	

	public checkOutFormPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	By firstName = By.id("wpforms-2562-field_0");
	By lastName = By.id("wpforms-2562-field_0-last");
	By email = By.id("wpforms-2562-field_1");
	public By emailError = By.id("wpforms-2562-field_1-error");
	By submit = By.id("wpforms-submit-2562");
	By dropDown = By.xpath("//select[@id='wpforms-2562-field_3']");
	By firstNameEmpty = By.id("wpforms-2562-field_0-error");
	
	

	

	public void addFirstName(String Name) {
		
		driver.findElement(firstName).sendKeys(Name);
	}
	public void addLastName(String Name) {
		
		driver.findElement(lastName).sendKeys(Name);
	}
	public void addEmail(String Name) {
		
		driver.findElement(email).sendKeys(Name);
	}
	public String getTitleFormPage() {
		
		return driver.getCurrentUrl();
	}
    public String getEmailErrorMessage() {

        return driver.findElement(emailError).getText();
    }

	public void getSubmitButton() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(submit));
		driver.findElement(submit).click();
	}
	public void getDropDown(String option) {
		WebElement dropdown = driver.findElement(dropDown);
		Select select = new Select(dropdown);
	    select.selectByVisibleText(option);
    }
	public void selectCheckboxByOption(String optionText) {
	    String checkboxId;
	    switch (optionText) {
	        case "Par réseaux sociaux":
	            checkboxId = "wpforms-2562-field_6_3"; 
	            break;
	        case "Par email":
	            checkboxId = "wpforms-2562-field_6_1";
	            break;
	        default:
	            throw new IllegalArgumentException("Option non reconnue : " + optionText);
	    }

	    WebElement checkbox = driver.findElement(By.id(checkboxId));
	    if (!checkbox.isSelected()) {
	        checkbox.click();
	    }
	}
	


	
}
