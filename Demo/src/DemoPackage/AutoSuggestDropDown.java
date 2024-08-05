package DemoPackage;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
 //import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//  WebDriver driver = new EdgeDriver();
			WebDriver driver =new ChromeDriver();
		//	WebDriver driver =new FirefoxDriver(); 
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// for selecting checkbox and also checked wheather they are selected or not >> use below 3 lines of code >>>>>>>>>>>>>>>	
			System.out.println(driver.findElement(By.name("ctl00$mainContent$chk_IndArm")).isSelected());
			driver.findElement(By.id("ctl00_mainContent_IndArm")).click();
			System.out.println(driver.findElement(By.name("ctl00$mainContent$chk_IndArm")).isSelected());
		// for calculating no of checkbox present in the whole page use below single line >>>>>>>>>>>>>>>>>>>
			System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
			driver.findElement(By.id("autosuggest")).sendKeys("ind");
			Thread.sleep(3000l);
			List<WebElement> options = driver.findElements(By.cssSelector("a[class='ui-corner-all']"));
			for(WebElement option :options)
			{
				if(option.getText().equalsIgnoreCase("India"))
				{
				option.click();
				break;
			}

		}
	}

	}


