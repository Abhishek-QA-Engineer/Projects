package DemoPackage;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
 //import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	//	driver.get("https://corporate.spicejet.com/Default.aspx");
	// Static dropdown >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	
	// dropdown with tagname as "Select" will be static and there is a class as select in Selenium so we need to create an object for that.	
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		// letest dropdown logging ui >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000l);
	// if we want to click more that one time then will use loop instead of repeating the below line	
	int i = 1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
	//	Dyanmic dropdown >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
	//	driver.findElement(By.xpath("(//a[@value='MAA'])[1]")).click();
	//  we can write above x path with the help of parent child relationship also	
		driver.findElement(By.xpath("//div[@id= 'glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value= 'MAA']")).click();
		Thread.sleep(2000l);
		driver.findElement(By.xpath("(//a[@value= 'BLR'])[2]")).click();
	//	driver.findElement(By.id("ctl00_mainContent_IndArm")).click();
	// for selecting current date 
		Thread.sleep(2000l);
		driver.findElement(By.cssSelector("a[class='ui-state-default ui-state-highlight ui-state-hover']")).click();
		driver.findElement(By.id("ctl00_mainContent_IndArm")).click();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
		 
		
		
		
		
		
		
	}


	}


