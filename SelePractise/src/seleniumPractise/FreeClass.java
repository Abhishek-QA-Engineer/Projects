package seleniumPractise;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FreeClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
	//	WebDriver driver = new EdgeDriver();

        // Navigate to the webpage
        driver.get("https://www.amazon.in/ref=nav_logo/");
        driver.manage().window().maximize();
        
        
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Men");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        
        
//        driver.switchTo().window(null).get("https://accenture.wd3.myworkdayjobs.com/en-US/AccentureCareers/login?redirect=%2Fen-US%2FAccentureCareers%2FuserHome");
//        Thread.sleep(5000);
//        driver.close();
//        driver.switchTo().window(null).get("https://www.amazon.in/ref=nav_logo/");

  //      driver.navigate().to("https://www.shutterstock.com/search/linkedin-background");
//        WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
//        String searchValue = searchField.getAttribute("placeholder");
//        System.out.println("Search field value: " + searchValue);
//        Thread.sleep(5000);
//        List<WebElement> sliders =driver.findElements(By.cssSelector(".feed-carousel-card._deals-shoveler-v2_style_dealCard__1HqkZ._deals-shoveler-v2_style_dealCardMinHeight__3YZz0"));
//        System.out.println("no. of sliders" + sliders.size());
//       
//        List<WebElement> images=  driver.findElements(By.tagName("img"));
//        System.out.println("no. of images :" + images.size());
        
        
        
      
	}	

}
