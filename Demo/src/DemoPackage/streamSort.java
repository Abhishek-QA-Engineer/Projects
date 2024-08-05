package DemoPackage;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class streamSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// web table sorting using stream method
		// click on the column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//capture all the element in list
		List<WebElement> elementList =  driver.findElements(By.xpath("//tr/td[1]"));
        // capture text of all the list element in original list
		List<String> originalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		// sort the original list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(originalList.equals(sortedList));
		
		// print price of given veggie name 
		//but there are 4 different tab in which we have to find out the elements so here we need do- while loop
		List<String> price;
		do
		{	
		 List<WebElement> rows =  driver.findElements(By.xpath("//tr/td[1]"));
		 price =  rows.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceVaggie(s)).collect(Collectors.toList());
		
		price.forEach(a->System.out.println(a));
		if(price.size()<1)
		{
			driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
		}
		}
		while(price.size()<1);
		
	}

	private static String getPriceVaggie(WebElement s) {
		// TODO Auto-generated method stub
		// as with the help of above elementlist method we are already on that specific veggie so now we just move to child from there to achieve price of veggie
		// here n need to write driver.find....... as we are already on that veggie so we will start with "s"
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}
	
	

}
