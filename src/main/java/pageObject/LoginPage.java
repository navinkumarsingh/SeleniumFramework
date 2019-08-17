package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	By email = By.cssSelector("[id=user_email]");
	By pwd = By.cssSelector("[id=user_password]");
	By logIn = By.cssSelector("input[value='Log In']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getEmail() {
		 return driver.findElement(email);
	}
	
	public WebElement getPwd() {
		return driver.findElement(pwd);
	}
	
	public WebElement getLogin() {
		return driver.findElement(logIn);
	}

}
