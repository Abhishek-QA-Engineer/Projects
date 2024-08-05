package PractiseTestNG;

import java.time.Duration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class ParallelTesting {
	
	public WebDriver driver = new ChromeDriver();
//	public WebDriver driver1 = new EdgeDriver();
	 
	
//	public WebDriver driver1 = new EdgeDriver();
	
	@BeforeClass
	void setup() throws InterruptedException
	{
		
//		WebDriverManager.chromedriver().setup();
//		WebDriverManager.edgedriver().setup();
//		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
	@Test(priority=1)
	void login() throws InterruptedException
	{
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
//		driver.get("https://microsoftedge.microsoft.com/addons/detail/check-my-links/bfheclhgcmjgknihnfdollfjaeofmmjg");
		driver.manage().window().maximize();
		Thread.sleep(2000); 		
	    driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("abc@gmail.com");
	    driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("abc");
	    driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();

}
	
	@Test(priority=2)
	void testAppUrl()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://tutorialsninja.com/demo/index.php?route=account/login..");
	}
	
	@Test(priority=3,dependsOnMethods = {"testAppUrl"})
	void testHomePageTittle()
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	void tearsDown()
	{
		driver.close();
	}
	
	
}
