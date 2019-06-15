package demo.com.MavenDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );

		App ap= new App();
		ap.setup();
		LoginInfo log=new LoginInfo(driver);
		log.login();
		//ap.teardown();
		DressSelection ds=new DressSelection(driver);
		ds.Selection();
	    
		
    }
		
		 //driver.quit();
		//driver.findElement(By.xpath("//*[@type='submit']"));
		//driver.findElement(By.xpath("//*[@value='Log In']"));
		//driver.findElement(By.xpath("//form[starts-with (@id, 'searchbx')]"));
		//driver.findElement(By.xpath("//form[contains (@id, ch)]"));
		//option [contains(text(), 'February')]
   static WebDriver driver;
		public void setup()
		{
			System.setProperty("webdriver.chrome.driver", "Resource\\chromedriver.exe");
		 driver= new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account ");
		}
		
		
		public void teardown()
		{
			driver.quit();
		}
		
    
}
