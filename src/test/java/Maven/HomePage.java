package Maven;

import java.io.IOException;

import org.apache.logging.log4j.*;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.Base;

public class HomePage extends Base{
public static Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void launchBrowser() throws IOException {
		driver = initializeDriver();
	log.info("Driver is initialized successfully");
	}
	@Test(dataProvider="getData")
	public void pageNavigation(String username, String pwd) throws IOException{
	
		driver.get(prop.getProperty("url"));
		
		LandingPage lp = new LandingPage(driver);
		lp.getLogin().click();
		LoginPage l = new LoginPage(driver);
		l.getEmail().sendKeys(username);
		l.getPwd().sendKeys(pwd);
		l.getLogin().click();
		log.info("Successfully passed username and password and clicked on Login button, Landed to Home page");
	}
	

	@AfterTest
	public void tearDown() {
		driver.quit();
		//below code will save the memory
		driver= null;
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		data[0][0] = "nonrestricteduser@gmail.com";
		data[0][1] = "pwd@1234";
		
		data[1][0] = "restricteduser@gmail.com";
		data[1][1] = "pwd@1234567";
		return data;
	}
}
