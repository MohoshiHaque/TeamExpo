package seleniumbatch;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing1 {
	
	WebDriver driver;
	
	@BeforeTest
	public void init() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}

	
	@Test(priority=1)
	public void TestTitle() {
		
		String ExpectedTitle = "Swag Lab";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle,"Code Run");
		
	}
	
	@Test(priority=2)
	public void TestUrl() {
		
		String ExpectUrl= "https://www.saucedemo.com/";
		String ActualUrl = driver.getCurrentUrl();
		Assert.assertEquals(ActualUrl, ExpectUrl,"Kmn");
		
	}

	

}
