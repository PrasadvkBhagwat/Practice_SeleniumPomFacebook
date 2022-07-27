package testClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.LoginPage;
import pomClasses.RememberBrowserPage;

public class TestClass1 {

	static WebDriver driver;
	
	
	public static void main(String[] args){
		

		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing Notes\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		verifyUserCanLogin();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
	}
	
	
	public static void verifyUserCanLogin()
	{
		LoginPage lp = new LoginPage(driver);
		
		lp.enterEmail();
		lp.enterPassword();
		lp.clickBtn();
		
		RememberBrowserPage rp = new RememberBrowserPage(driver);
		
		rp.dontSave();
		rp.continueBtn();
	}
	
}
	

