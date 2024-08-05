package DemoPackage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Locators {
	
	private int a;    

	public Locators(){
	    a = 10;
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	//	WebDriver driver = new EdgeDriver();
//		WebDriver driver = new ChromeDriver();
//	//	WebDriver driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Locators obj = new Locators();
	    obj.a = -10;
	    System.out.println(obj.a);
         
		
	}

}
