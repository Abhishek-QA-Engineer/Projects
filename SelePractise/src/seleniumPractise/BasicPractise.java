package seleniumPractise;
import java.time.Duration;
import org.openqa.selenium.By;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import dev.failsafe.internal.util.Assert;

public class BasicPractise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	//	ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
	//	WebDriver driver =new EdgeDriver();
	//	WebDriver driver = new FirefoxDriver();
		
//		driver.get("https://www.youtube.com/shorts/v_JN4dH713I");
//		Thread.sleep(5000);
//		driver.findElement(By.className("ytp-large-play-button-bg")).click();
//		
//		System.out.println(driver.getTitle());
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Abhishek");
		driver.findElement(By.name("inputPassword")).sendKeys("abhi");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(5000);
	    System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	    driver.findElement(By.linkText("Forgot your password?")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Abhishek");
	    driver.findElement(By.cssSelector("[placeholder='Email']")).sendKeys("abhi@hmail.com");
	    driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("6398356197");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
	    System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());
	    String s =   driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
	    String a[] = s.split("'");
	    System.out.println(a[1]);
	    String s1 = a[1];
     	driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
     	Thread.sleep(5000);
     	driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Abhishek");
     	driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys(s1);
     	driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
     	driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
     	Thread.sleep(5000);
     	System.out.println(driver.findElement(By.tagName("p")).getText());
     	Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
     	
     	
     	
     	
	    
	    
	

}

}

