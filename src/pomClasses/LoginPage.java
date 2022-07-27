package pomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testClasses.TestClass1;

public class LoginPage extends TestClass1{

	
	WebDriver driver;
	
	private By emailfield = By.xpath("//input[@id='email']");
	private By passwordfield = By.xpath("//input[@id='pass']");
	private By loginbtn = By.xpath("//button[@name='login']");
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public void enterEmail()
	{
		driver.findElement(emailfield).sendKeys("prasadbhagwat007@gmail.com");
	}
	
	public void enterPassword()
	{
		driver.findElement(passwordfield).sendKeys("8975105325");
	}
	
	public void clickBtn()
	{
		driver.findElement(loginbtn).click();
	}
								
					
}
