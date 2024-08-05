package DemoPackage;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class practiseMore {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// Give us link count on above page
		System.out.println(driver.findElements(By.tagName("a")).size());
		// now we want to count only footer link available on that page but our driver is working as globally so here we are going to limit our driver with in footer only
		// for limiting WebDriver we have to select that web section in which we want to limit our driver and then just create web element for that
		WebElement footerDriver=driver.findElement(By.id("gf-BIG"));
		// now we will use footer driver as our main driver and will access the methods 
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		// if we want to count link for a particular coloumn within footer ....here we will create again web driver using footerDriver because we are already in footer section 
		// with the help of footerDriver.
		WebElement coloumnDriver= footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumnDriver.findElements(By.tagName("a")).size());
		// click on each link present in coloumn section and check if they are working ....
		// for that we will write an general syntax so that in case we developer add/remove any link then our script will not work so we are making it static/
		for(int i=0;i<coloumnDriver.findElements(By.tagName("a")).size();i++)
		{	
			// test case is failing after clicked on first link under coloumn section because every time we need to come back on main page
			// we can handle this problem by using back button after every click but it will take more time and in anther way we can open the links 
			//which are comes under coloumn section in another tab by hitting enter from key board 
			String clickOnLinktab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinktab);
			Thread.sleep(5000);
		}
		Set<String> abhi= driver.getWindowHandles(); 
		// iterator will help us to move from ne to another tab/ window
		Iterator<String> it = abhi.iterator();
		
		while(it.hasNext())
		{
			// here "hasNext()" tell us if there is any next window present or not ...
			// here it.next() basically will print the window id which we want to perform any action or switch on that window
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}
		
		

	}



	}


