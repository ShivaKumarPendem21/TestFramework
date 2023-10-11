package Test;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import resources.Base;

public class OneTest extends Base  {
	public WebDriver driver;
	@Test
	private void TestOne() throws IOException, InterruptedException {
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
		Assert.assertTrue(false);
	}
	@AfterMethod
	public void closure() {
		driver.quit();
	}
}
