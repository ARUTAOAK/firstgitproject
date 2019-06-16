package demo.com.MavenDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;

	@Test
	public void f() {
		LoginInfo log=new LoginInfo(driver);
		log.login();
		
		DressSelection ds=new DressSelection(driver);
		ds.Selection();
	}

	@BeforeTest
	public void setup() {

		// System.out.println("run1");

		System.setProperty("webdriver.chrome.driver", "Resource\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account ");

	}

	@AfterTest
	public void afterTest() {
		// System.out.println("run2");
		driver.quit();
	}

}
