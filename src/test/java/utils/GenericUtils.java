package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	public WebDriver driver;
	public GenericUtils(WebDriver driver) {
		this.driver= driver;
	}
	public void pointerOnTheChildWindow() {
		
		Set<String> s1=driver.getWindowHandles(); // it handle the parent and the child windows (Strings)
		Iterator<String> i1=s1.iterator(); // s1 = [page1 id ,page2 id] 
		String parentWindow = i1.next();
		String childWindow = i1.next();
		driver.switchTo().window(childWindow);
	}
}
