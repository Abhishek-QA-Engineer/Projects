package javaBasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;



public class AnuSelenium {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","\"C:\\Users\\hp\\Downloads\\geckodriver-v0.33.0-win-aarch64.zip\"");
		WebDriver obj = new EdgeDriver();
		obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		obj.get("https://rahulshettyacademy.com/locatorspractice/");
		obj.findElement(By.id("inputUsername")).sendKeys("Anushka");
		obj.findElement(By.name("inputPassword")).sendKeys("Hello@123");
		obj.findElement(By.className("signInBtn")).click();
		System.out.println(obj.findElement(By.cssSelector("p.error")).getText());
		obj.findElement(By.linkText("Forgot your password?")).click();
		//Thread.sleep(Duration.ofSeconds(2));
		obj.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Anu");
		obj.findElement(By.cssSelector("input[placeholder ='Email']")).sendKeys("anushka.sherawat@gmail.com");
		obj.findElement(By.xpath("//input[@type='text'][2]")).clear();
		obj.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("vinam.sherawat@gmail.com");
		obj.findElement(By.xpath("//form/input[3]")).sendKeys("32165498710");
		//obj.findElement(By.className("reset-pwd-btn")).click();
		obj.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(obj.findElement(By.cssSelector("form p")).getText()); 
		//obj.findElement(By.className("go-to-login-btn")).click();
		obj.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		obj.findElement(By.cssSelector("input#inputUsername")).sendKeys("Anushka");
		obj.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		obj.findElement(By.id("chkboxOne")).click();
		obj.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	    Thread.sleep(3000);
		System.out.println(obj.findElement(By.tagName("p")).getText());
	//	Assert.assertEquals(obj.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		//Thread.sleep(1000);
		//obj.findElement(By.xpath("//button[text() ='Log Out']")).click();
		
		//Assert.assertEquals(obj.findElement(By.tagName("p")).getText(),"You are successfully logged in");
		//obj.findElement(By.xpath("//button[contains(@class,'go-to-login-btn')]")).click();
		//obj.findElement(By.cssSelector("#inputUsername")).sendKeys("Anu");
		//obj.findElement(By.cssSelector("input[type*='pass']" )).sendKeys("rahulshettyacademy");
		//obj.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
	}
	

}
