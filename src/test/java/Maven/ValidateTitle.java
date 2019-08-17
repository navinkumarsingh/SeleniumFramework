package Maven;

import java.io.IOException;

import org.apache.logging.log4j.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.LandingPage;
import resources.Base;

public class ValidateTitle extends Base{
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void launchBrowser() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Hoem Page");
	}
	
	@Test()
	public void pageNavigation() throws IOException{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		log.info("Successfully validated text message");

}
	
	@Test()
	public void pageNavigation1() throws IOException{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		log.info("Successfully validated text message");

}
	@Test()
	public void pageNavigation2() throws IOException{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		log.info("Successfully validated text message");

}
	@Test()
	public void pageNavigation3() throws IOException{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		log.info("Successfully validated text message");

}

	@Test()
	public void pageNavigation4() throws IOException{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		log.info("Successfully validated text message");

}

	@AfterTest
	public void tearDown() {
		driver.quit();
		log.info("Successfully closed the browser");
		//below code will save the memory
				driver= null;
	}
}
