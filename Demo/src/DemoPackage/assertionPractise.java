package DemoPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class assertionPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		//	WebDriver driver =new ChromeDriver();
		//	WebDriver driver =new FirefoxDriver(); 
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// for selecting checkbox and also checked wheather they are selected or not by using Assertion methods >>>>>>>>>>>>>>>	
			Assert.assertFalse(driver.findElement(By.name("ctl00$mainContent$chk_IndArm")).isSelected());
		//	System.out.println(driver.findElement(By.name("ctl00$mainContent$chk_IndArm")).isSelected());
			driver.findElement(By.id("ctl00_mainContent_IndArm")).click();
		//	System.out.println(driver.findElement(By.name("ctl00$mainContent$chk_IndArm")).isSelected());
			Assert.assertTrue(driver.findElement(By.name("ctl00$mainContent$chk_IndArm")).isSelected());


	}

}
