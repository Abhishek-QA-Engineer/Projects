package PractiseTestNG;

import java.time.Duration;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderPractise {
	
	public WebDriver driver = new ChromeDriver();
	
	@BeforeClass
	void setup()
	{
//		driver = new EdgeDriver();
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}  
	
	@Test(dataProvider="dp")
	void testlogin(String email, String pwd) throws InterruptedException
	{
     	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
//		driver.get("https://microsoftedge.microsoft.com/addons/detail/check-my-links/bfheclhgcmjgknihnfdollfjaeofmmjg");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	}
	
	@AfterClass
	void tearsDown()
	{
		driver.close();
	}
	
	@DataProvider(name="dp")
	String[][] loginData()
	{
		String data[][] = {
				
				{"abc@gmail.com", "abc"},
				{"abhi.@gmail.com", "test123"},
				{"ashu@gmail.com",  "test3456"},
		};
		
	return data;	
	}

}
