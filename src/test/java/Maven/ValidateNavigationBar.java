package Maven;

import java.io.IOException;
import org.apache.logging.log4j.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.LandingPage;
import resources.Base;

public class ValidateNavigationBar extends Base{
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void launchBrowser() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		log.info("qaclick academy launched");
	}
	@Test()
	public void pageNavigation(){
		
		LandingPage l = new LandingPage(driver);
		Assert.assertTrue(l.getNavigationBar().isDisplayed());
		log.info("Successfully validated navigation bar");

}
	@Test()
	public void pageNavigation1(){
		
		LandingPage l = new LandingPage(driver);
		Assert.assertTrue(l.getNavigationBar().isDisplayed());
		log.info("Successfully validated navigation bar");

}
	@Test()
	public void pageNavigation2(){
		
		LandingPage l = new LandingPage(driver);
		Assert.assertTrue(l.getNavigationBar().isDisplayed());
		log.info("Successfully validated navigation bar");

}
	@AfterTest
	public void tearDown() {
		driver.close();
		log.info("Successfully closed the browser");
		//below code will save the memory
				driver= null;
	}

}
