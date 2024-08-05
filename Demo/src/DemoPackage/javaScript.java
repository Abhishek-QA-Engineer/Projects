package DemoPackage;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
public class javaScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		// for web table fix headers
    	List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		// .table-display td:nth-child(3)
		// for web table examples
	//	List<WebElement> values = driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
		int sum=0;
		for(int i=0;i<values.size();i++)
		{
			// as values which we are going to print are integer but here getText() will give us a sting so we have to change it into integer
	       sum = sum + Integer.parseInt(values.get(i).getText());
		}
		System.out.println(sum);
		// now we just want to compare this sum with the actual sum present on the above used web site
	//	driver.findElement(By.cssSelector(".totalAmount")).getText();
	//	driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
		// we have to convert above as an integer as we want to compare it with sum which is already an integer
	   int total =	Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
	    
	    // we can use assertion for comparison of sum with total ....let see
	    Assert.assertEquals(sum, total);
	    // test will pass if sum and total are same else test will fail ....
	}

}


	


