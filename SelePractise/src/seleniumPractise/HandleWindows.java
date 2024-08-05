package seleniumPractise;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.way2automation.com/");
		driver.findElement(By.xpath("//a[@aria-label='Facebook']//span[@class='ahfb-svg-iconset ast-inline-flex svg-baseline']")).click();
		
		Set<String> windowIds =driver.getWindowHandles();
		
		for(String windowId : windowIds)
		{
			System.out.println(driver.switchTo().window(windowId).getTitle());
		}
		

	}

}
