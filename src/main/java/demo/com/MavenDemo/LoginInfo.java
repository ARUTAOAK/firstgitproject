package demo.com.MavenDemo;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginInfo {
	WebDriver driver;
	public LoginInfo(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		driver=driver2;
	}
	public void login()
	{
		WebElement email=driver.findElement(By.id("email_create"));
		//emailTextBx.click();  
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);  
		email.sendKeys("username"+ randomInt +"@gmail.com");  
	
	//email.sendKeys("arutaoak1222@gmail.com");
	
	
	WebElement submit=driver.findElement(By.id("SubmitCreate"));
	submit.click();
	
	WebElement title=driver.findElement(By.id("id_gender2"));
	title.click();
	
	WebElement uname=driver.findElement(By.id("customer_firstname"));
	uname.sendKeys("aruta");
	
	WebElement lastname=driver.findElement(By.id("customer_lastname"));
	lastname.sendKeys("oak");
	
	WebElement pwd=driver.findElement(By.id("passwd"));
	pwd.sendKeys("qazwsx");
	
	//WebElement day=driver.findElement(By.id("days"));
	//day.click();
	
	Select st=new Select(driver.findElement(By.id("days")));
	st.selectByValue("4");
	
	Select stm=new Select(driver.findElement(By.id("months")));
	stm.selectByValue("2");
	
	Select sty=new Select(driver.findElement(By.id("years")));
	sty.selectByValue("2000");
	
	WebElement newset=driver.findElement(By.id("newsletter"));
	newset.click();
	
	WebElement fname=driver.findElement(By.id("firstname"));
	fname.sendKeys("Aruta");
	
	WebElement lname=driver.findElement(By.id("lastname"));
	lname.sendKeys("oak");
	
	WebElement address=driver.findElement(By.id("address1"));
	address.sendKeys("Mayur colony");
	
	WebElement city=driver.findElement(By.id("city"));
	city.sendKeys("Pune");
	
	Select state=new Select(driver.findElement(By.id("id_state")));
	state.selectByVisibleText("Arizona");
	
	WebElement postcode=driver.findElement(By.id("postcode"));
	postcode.sendKeys("41672");
	
	WebElement phno=driver.findElement(By.id("phone_mobile"));
	phno.sendKeys("8797654343");
	
	WebElement alias=driver.findElement(By.id("alias"));
	alias.sendKeys("My home");
	
	WebElement reg=driver.findElement(By.id("submitAccount"));
	reg.click();
	
	//WebElement email1=driver.findElement(By.id("authentication"));
	//email1.sendKeys("arutaoak12@gmail.com");
	
	//driver.findElement(By.className("is_required validate account_input form-control"));
	}

}
