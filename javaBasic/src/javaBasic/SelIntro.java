package javaBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.Assert;

public class SelIntro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String Name = "Abhishek";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\geckodriver-v0.33.0-win-aarch64.exe");
		
		//WebDriver driver = new GeckoDriver();
		WebDriver driver = new EdgeDriver();
		String password = getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(Name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		//driver.findElement(By.className("forgot-pwd-container")).click();
		//driver.findElement(By.id("chkboxTwo")).click();
		//Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+Name+",");
	//	Thread.sleep(3000);
	//	driver.findElement(By.xpath("//button[text() ='Log Out']")).click();
	//	Thread.sleep(1000);
	//	driver.close();
		
		
	}
	public static String getpassword(WebDriver driver) throws InterruptedException{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordtext = driver.findElement(By.cssSelector("form p")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordArray = passwordtext.split("'") ;
		String[] passwordArray2 = passwordArray[1].split("'");
		String password = passwordArray2[0];
		return password;


	}

}
