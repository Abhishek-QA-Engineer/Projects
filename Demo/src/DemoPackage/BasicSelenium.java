package DemoPackage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasicSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 // ChromeOptions options = new ChromeOptions();
		//  WebDriver driver = new EdgeDriver();
		WebDriver driver = new ChromeDriver();
	//  if we are using implicit wait then selenium will wait acc. to time given in the duration	  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
	//  we can get the title of  page or url which we are using currently 
  //  System.out.println(driver.getTitle()); 
  //  System.out.println(driver.getCurrentUrl());
  //  close will close the originating window open by selenium
  //  driver.close(); 
  //  quit will close the all the window open by selenium
  //  driver.quit();
        driver.findElement(By.id("inputUsername")).sendKeys("Abhi");
        driver.findElement(By.name("inputPassword")).sendKeys("A777");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
  //  if HTML code start with tagname as "a" then it will be a link so we can use linkText locator for that
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000); 
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Abhi");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("AB777");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("6398356197");
        driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
  //  we can also write x path by using parent tagname to child tagname  >> synyax >> "//parentTagname/childTagname"     
 //     System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        System.out.println(driver.findElement(By.xpath("//form/p")).getText());
        driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("inputUsername")).sendKeys("Abhi");
        driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.cssSelector("button[class=\"submit signInBtn\"]")).click();
        
        
	}




	}


