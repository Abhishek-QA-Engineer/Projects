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

public class BasicFlow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
//		WebDriver driver= new HtmlUnitDriver();
//		driver = webdriver.Remote(desired_capabilities=webdriver.DesiredCapabilities.HTMLUNIT)
		driver.get("https://www.way2automation.com/#");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.findElement(By.xpath("//li[@id='menu-item-27580']")).click();
		driver.findElement(By.xpath("//li[@id='menu-item-27582']")).click();
		driver.findElement(By.xpath("//li[@id='menu-item-27583']//span[contains(text(),'Selenium with Java')]")).click();
		
		driver.findElement(By.xpath("//div[@class='elementor-button-wrapper']//span[contains(text(),'BUY NOW')]")).click();
		
		driver.findElement(By.cssSelector("div[class='elementor-element elementor-element-e1ded04 elementor-align-center elementor-widget elementor-widget-button'] span[class='elementor-button-text']")).click();
		
		//driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("abhishektanwar");
		//button[@class='_2po1U PayPalForm_button__VLhM4 uni-pv-8 uni-ph-32 _1Q15i _2-Hb2 _1yqRw']
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2po1U PayPalForm_button__VLhM4 uni-pv-8 uni-ph-32 _1Q15i _2-Hb2 _1yqRw']")).click();
		
	//	driver.findElement(By.xpath("//li[@id='menu-item-27617']//span[contains(text(),'Resources')]")).click();
		
		
		
		
		

	}

}
