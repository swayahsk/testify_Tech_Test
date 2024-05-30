package pageObjects;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ThanksPage {
    public WebDriver driver;

    public ThanksPage(WebDriver driver) {
        this.driver = driver;
    }

    By confirmationMessage = By.id("wpforms-confirmation-2562");

    public void getThanksMessage(String string) {
        // Attendre que l'élément de confirmation soit visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement confirmationMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(confirmationMessage));

        // Extraire le texte du message de confirmation et utiliser trim() pour enlever les espaces blancs en début et fin de chaîne
        String actualMessage = confirmationMessageElement.getText().trim();

        // Vérifier que le message de confirmation est égal à "Thanks for contacting us!"
        assertEquals(actualMessage, "Thanks for contacting us!");
    }
}