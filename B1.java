package W6;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class B1 {
	public static String baseUrl= "http://demo.guru99.com/test/newtours/index.php";
	public static String driverPart = "D:\\Game\\chromedriver.exe";
	public static WebDriver driver;
	public static String expected = null;
	public static String actual = null;
	@BeforeTest
	public void lauchBrower() {
		System.out.println("launching Chrome brower");
		System.setProperty("webdriver.chorme.driver", driverPart);
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}
	@BeforeMethod
	public void HomepageTitle() {
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@Test(priority = 0)
	public void register() {
		driver.findElement(By.linkText("REGISTER")).click();
		expected = "Register: Mercury Tours";
		actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}
	@Test(priority = 1)
	public void support() {
		driver.findElement(By.linkText("SUPPORT")).click();
		expected = "Under Construction: Mercury Tours";
		actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}
	@AfterMethod
	public void goBackToHomepage() {
		driver.findElement(By.linkText("Home")).click();
	}
	@AfterTest
	public void terminatoBrowser() {
		driver.close();
	}
}
