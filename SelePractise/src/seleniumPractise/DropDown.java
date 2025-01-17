package seleniumPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	   WebDriver  driver = new ChromeDriver();
	   driver.get("https://www.way2automation.com/way2auto_jquery/dropdown.php#load_box");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   
	   driver.findElement(By.xpath("//a[normalize-space()='Dynamic Elements']")).click();
	
	   driver.findElement(By.xpath("//a[contains(text(),'Dropdown')]")).click();
	   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[normalize-space()='Select Country']")).click();
	   
	   
	   
	   driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='dropdown/default.html']")));
	   
	   WebElement  selectCountry=  driver.findElement(By.xpath("//body//select"));

	   Select sc = new Select(selectCountry);    
	   Thread.sleep(2000);
	   sc.selectByIndex(1);
	   
	   driver.switchTo().parentFrame();
	   
	   driver.findElement(By.xpath("//a[normalize-space()='Enter Country']")).click();
	   
	   driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='dropdown/default1.html']")));
	  
	   WebElement  enterCountry=  driver.findElement(By.xpath("//select[@id='combobox']"));
	   
	   Select sc1= new Select(enterCountry);
	   
	   sc1.selectByVisibleText("Aruba");

	   
	   
	   
	   
	  
	
	

	}

}
