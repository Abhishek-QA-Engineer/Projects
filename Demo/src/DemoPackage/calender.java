package DemoPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//	EdgeOptions e = new EdgeOptions();
	//	e.setAcceptInsecureCerts(true);
	//	e.setPageLoadTimeout(Duration.ofSeconds(15));
	//	e.addArguments("--disable-notifications");
	//	e.addArguments("--guest");
		
//		
		WebDriver driver = new ChromeDriver();
	//	WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.path2usa.com/travel-companion/");
		
		
//		WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(10));
//		Alert alert = w.until(ExpectedConditions.alertIsPresent());
//
//		//Store the alert text in a variable
//		String text = alert.getText();
//
//		//Press the OK button
//		alert.accept();
		
		//w.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='form-field-travel_comp_date']")));
	WebElement le=	driver.findElement(By.xpath("//input[@name='form_fields[travel_comp_date]']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("arguments[0].scrollIntoView(true);",le);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='form_fields[travel_comp_date]']")).click();
		// //div[@class='flatpickr-month']/div/span
		// need to practise year pending>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		while(!driver.findElement(By.xpath("//div[@class='flatpickr-current-month']")).getText().contains("December"))
{
	  driver.findElement(By.xpath("//div/span[@class='flatpickr-next-month']")).click();
}
		
	List<WebElement> dates = driver.findElements(By.xpath("//div[@class='dayContainer']/span"));
		int count = driver.findElements(By.xpath("//div[@class='dayContainer']/span")).size();
		
		for(int i=0;i<count;i++)
		{
			String text = driver.findElements(By.xpath("//div[@class='dayContainer']/span")).get(i).getText();
     		if(text.equalsIgnoreCase("25"))
			{
     			Thread.sleep(1000);
				driver.findElements(By.xpath("//div[@class='dayContainer']/span")).get(i).click();
				break;
			}
		}
		

	}




	}


