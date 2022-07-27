package pomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RememberBrowserPage {

	
	WebDriver driver;
	
	private By dontsave = By.xpath("(//input[@type='radio'])[2]");

	private By continuebtn = By.xpath("//button[@value='Continue']");
	
	
	public RememberBrowserPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void dontSave()
	{
		driver.findElement(dontsave).click();
	}
	
	public void continueBtn()
	{
		driver.findElement(continuebtn).click();
	}
}
