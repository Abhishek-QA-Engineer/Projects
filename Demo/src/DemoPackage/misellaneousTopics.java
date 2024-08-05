package DemoPackage;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
//import org.apache.commons.io.FileUtils;
public class misellaneousTopics {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		EdgeOptions options = new EdgeOptions();
		options.setAcceptInsecureCerts(true);
		
		WebDriver driver = new EdgeDriver(options);
		driver.manage().window().maximize();
	//	driver.get("https://expired.badssl.com/");
	//	System.out.println(driver.getTitle());
		// we can take screen shot of any site which we have opened via Selenium with the help of below code
	//	File src =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	//	FileUtils.copyFile(src, new File("C:\\Users\\Lenovo\\Downloads\\Abhishek\\screenshot.png"));
		// if we want to check any link is broken or not .....
		// step1 : first of all we need to get all urls tied up to the links using selenium
		// step 2: if status code > 400 then that url is nt working :-link which tied up to link is broken
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//	    String url =	driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
	    // now we will use openConnection method which is comes under url class to get the status code of above url >>>>>>>>>>>>>>>
//	    HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
//	    conn.setRequestMethod("HEAD");
//	    conn.connect();
//	    int responseCode = conn.getResponseCode();
//	    System.out.println(responseCode); 
	    
	    // with the help of above code we can check only one link at time but if we wan to iterate over all the links present tin the page then we will use
	  List<WebElement> links =  driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	  SoftAssert a = new SoftAssert();
	  for(WebElement link : links)
	  {
		  String url =	link.getAttribute("href");
		  HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		    conn.setRequestMethod("HEAD");
		    conn.connect();
		    int responseCode = conn.getResponseCode();
		    System.out.println(responseCode); 
//		    if(responseCode>400)
//		    {
//		    	System.out.println("The link with text" + link.getText() + "is broken with code" + responseCode );
//		    	Assert.assertTrue(false);
//		    }
		    // above code by using "if" will be terminate if the the condition fail once then it will not check the rest links present on web page
		    // so to avoid this problem we will use "Soft assertion" method 
	        a.assertTrue(responseCode<400, "The link with text" + link.getText() + "is broken with code" + responseCode);
	       
	        
	  }
	    
	       a.assertAll();
		 
		
		
		
		
		

	}

}
