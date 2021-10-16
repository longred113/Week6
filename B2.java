package W6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B2 {
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
	@Test(priority = 0)
	public void VerifyRegister() {
	    WebElement w = driver.findElement(By.xpath("//*[@style= 'margin-left:20px;']/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
	    w.click();

	    List<WebElement> childElements = driver.findElements(By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']/input"));
	    for(int i = 0; i<childElements.size();i++) {
	    	childElements.get(0).sendKeys("Long");
	        childElements.get(1).sendKeys("Le");
	        childElements.get(2).sendKeys("1234456789");
	        childElements.get(3).sendKeys("Longle35610@gmail.com");

	        childElements.get(4).sendKeys("Pham Van Dong");
	        childElements.get(5).sendKeys("Thu Duc");
	        childElements.get(6).sendKeys("Phuong 10");
	        childElements.get(7).sendKeys("113457178347");

	        childElements.get(8).sendKeys("long123");
	        childElements.get(9).sendKeys("long321");
	        childElements.get(10).sendKeys("long321");
	        break;
	    }

	    WebElement submit = driver.findElement(By.xpath("//*[@name='submit']"));
	    submit.click();

	    System.out.print("Tạo thành công!");
	    }
	@Test(priority = 1)
	public void VerifyLogin() {
		WebElement login = driver.findElement(By.xpath("//*[@face='Arial, Helvetica, sans-serif']/a"));
        login.click();
        List<WebElement> childElements1 = driver.findElements(By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']/input"));
        for(int i = 0; i<childElements1.size();i++) {
            childElements1.get(0).sendKeys("long123");
            childElements1.get(1).sendKeys("long321");
            break;
        }

        WebElement submitlogin = driver.findElement(By.xpath("//*[@name='submit']"));
        submitlogin.click();
	}
	
}
