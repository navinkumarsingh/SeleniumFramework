package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	By signIn = By.cssSelector("a[href*='sign_in']");
	By title = By.xpath("//h2[@xpath='1']");
	By navigation = By.cssSelector(".nav.navbar-nav.navbar-right");
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getLogin() {
	
	return driver.findElement(signIn);
}
	
	public WebElement getTitle() {
		
		return driver.findElement(title);
	}
	
public WebElement getNavigationBar() {
		
		return driver.findElement(navigation);
	}
	
		
}