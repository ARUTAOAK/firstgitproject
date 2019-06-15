package demo.com.MavenDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DressSelection {

	WebDriver driver;
	public DressSelection(WebDriver driver2) {
		driver=driver2;
		// TODO Auto-generated constructor stub
	}
	public void Selection()
	{
		WebElement tab=driver.findElement(By.linkText("WOMEN"));
		
		Actions act= new Actions(driver);
		act.moveToElement(tab);
		
		
		WebElement subtab=driver.findElement(By.linkText("Dresses"));
		subtab.click();
		
		driver.findElement(By.xpath("//a[@class='product-name']")).click();
		driver.findElement(By.xpath("//a[@id='color_15' and @name='Green']")).click();
		//driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		driver.findElement(By.id("add_to_cart")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();
		//span[contains(text(),'Proceed to checkout')]
		driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
		driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("hey deliver me fast");
		driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
		driver.findElement(By.id("cgv"));
	}
}
