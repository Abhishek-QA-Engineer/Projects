package DemoPackage;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		// if we want to add more than item in the cart then we have to use array  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Implicit wait -- it will apply wait of given duration in the method on each and every step present in the code
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		int j=0;
		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot","Potato"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
//	WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(5));
	
	 
	for(int i=0;i<=products.size();i++)
	{
		// format it to get actual vegetable name
		String[] name = products.get(i).getText().split("-");
		// here formated name will be with a space as it is already in HTML so we have to use trim command to remove that space
		String formattedName =name[0].trim();
		
		// convert array to array list for easy search
		// check  weather name you extracted is present in array list or not 
		
		List itemsNeededList = Arrays.asList(itemsNeeded);
		
		
		if(itemsNeededList.contains(formattedName))
		{
			j++;
			//click to add to cart
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			if(j==itemsNeeded.length)
			break;
		}

	}
	driver.findElement(By.cssSelector("img[alt='Cart']")).click();
	driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
//	w.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("input.promoCode"))));
	driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
	driver.findElement(By.cssSelector("button.promoBtn")).click();
	// Explicit Wait -- it will affect only target step where we want to....
	
	
//	w.until(ExpectedConditions.invisibilityOfElementLocated	(By.cssSelector("span[class='promoInfo']")));
	System.out.println(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText()); 
	

}

	}


