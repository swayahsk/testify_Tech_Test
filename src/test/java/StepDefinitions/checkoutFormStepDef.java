package StepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.checkOutFormPage;
import pageObjects.ThanksPage;
import utils.TestContextSetup;
import org.testng.Assert;
import java.util.regex.Pattern;

public class checkoutFormStepDef {
public WebDriver driver;
public String checkoutFormStepDef;

TestContextSetup testContextSetup;
checkOutFormPage checkOutFormPage;
ThanksPage ThanksPage;
//Spring framework, EJB, 
//SRP
//
public checkoutFormStepDef(TestContextSetup testContextSetup)
{
	this.testContextSetup=testContextSetup;
	this.checkOutFormPage =testContextSetup.pageObjectManager.getCheckOutFormPage();
	this.ThanksPage= testContextSetup.pageObjectManager.getThanksPage();
}
	@Given("je suis sur la page du formulaire de contact")
	public void user_is_on_green_cart_landing_page() {
    // Write code here that turns the phrase above into concrete actions
		
        Assert.assertTrue(checkOutFormPage.getTitleFormPage().contains("testify"), "The URL does not contain 'testify'");
	}
	@When("^je remplis le champ Nom avec (.+)$")
	public void Added_firstName(String name) {
		
		checkOutFormPage.addFirstName(name);
			
}

	@When("^je remplis le champ Prenom avec (.+)$")
	public void Added_lastName(String name)
	{
		checkOutFormPage.addLastName(name);
		
	}
	@When("^je remplis le champ Email avec (.+)$")
	public void Added_Email(String email) {
    checkOutFormPage.addEmail(email);
    String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    Pattern pattern = Pattern.compile(emailRegex);

    if (!pattern.matcher(email).matches()) {
        String errorMessage = checkOutFormPage.getEmailErrorMessage();
        Assert.assertTrue(errorMessage.contains("Veuillez saisir une adresse -mail valide."), 
            "Le message de validation de l'email n'est pas affiché correctement");
    }}

	@When("the user selects {string} from the Where did you hear about us dropdown")
	public void the_user_selects_from_the_where_did_you_hear_about_us_dropdown(String option) {
	    // Write code here that turns the phrase above into concrete actions
		checkOutFormPage.getDropDown(option);
	}
	@When("the user selects {string} from the Je souhaite être contacté checkbox")
	public void the_user_selects_from_the_checkbox(String option) {
	    // Write code here that turns the phrase above into concrete actions
		checkOutFormPage.selectCheckboxByOption(option);
	}

	@Then("je click sur le boutton submit")
	public void je_click_sur_submit() {
	    // Write code here that turns the phrase above into concrete actions
		checkOutFormPage.getSubmitButton();
	}
	@Then("je devrais voir un message {string}")
	public void je_devrais_voir_un_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    ThanksPage.getThanksMessage(string);
	}

}