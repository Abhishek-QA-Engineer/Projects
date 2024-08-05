package DemoPackage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//	    driver.manage().deleteCookieNamed("put cookie name here");
		
//		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
//		driver.findElement(By.cssSelector(".blinkingText")).click();
//		Set<String> windows= driver.getWindowHandles(); //[parentid ; childid]
//		Iterator<String> it= windows.iterator();
//		String parentId = it.next();
//		String childId =it.next();
//		driver.switchTo().window(childId);
//		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
//		 String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
//		driver.switchTo().window(parentId);
//		driver.findElement(By.id("username")).sendKeys(emailId);
		
		// invoking multiple window at a time>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// https://courses.rahulshettyacademy.com/courses
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		// here we can also use window intead of tab if we want to open the url in new window. for that just put Window in place of TAB ...
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowid =it.next();
		String childWindowId = it.next();
		driver.switchTo().window(childWindowId);
		driver.get("https://courses.rahulshettyacademy.com/courses");
		String courseName = driver.findElement(By.cssSelector("div[title$='Test Automation Robot Framework with Python - Selenium Tests']")).getText();
		driver.switchTo().window(parentWindowid);
//		driver.findElement(By.cssSelector("[name='name']")).sendKeys(courseName);
		
		// if we want to take screen shot of that web element where we have entered our course name to check weather it is ok or not so we can use ...>>>>>>>>>>>>>
		WebElement  name = driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(courseName);
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("course.png"));
		
		// let see how to get height and width of web element >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		
		
		
		
		
		
		

	}


	}


