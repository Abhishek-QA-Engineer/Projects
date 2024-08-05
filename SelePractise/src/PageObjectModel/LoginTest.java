package PageObjectModel;

import java.time.Duration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
  public WebDriver driver= new ChromeDriver();
	
	@BeforeClass
	void setUp()
	{
//		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
	}
	
	@Test
	void testLogin()
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		LoginPage lp = new LoginPage(driver);
		lp.setUserEmail("abhi@gmail.com");
		lp.setPassword("abcd");
		lp.clickLogin();
	}

	@AfterClass
	void tearsdown()
	{
		
	}
}
