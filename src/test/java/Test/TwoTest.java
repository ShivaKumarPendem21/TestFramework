package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import resources.Base;

public class TwoTest extends Base{
	public WebDriver driver;
	@Test
	private void TestTwo() throws IOException {
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
	}
	@AfterMethod
	public void closure() {
		driver.close();
	}
}
