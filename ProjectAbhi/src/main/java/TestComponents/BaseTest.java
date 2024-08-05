package TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import TestNG.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException
	{
		// with the help of BaseTest class we are going to create an public base class which will include our some basic common code of line to initialize
		// the driver so that whenever we need to run any test from anywhere or any class , we can just call this class instead of writing this code every time
		// here we need to create global data file which will include info regarding the browser on which we want to run the test
		// In java we have a class name as properties we will help us to read the properties.....and then decide which driver will run the code..
		// Note : while creating the global data file we have to give " .properties" after the name of global file name so that we can extract all the global parameters values
		// we can use "@BeforeMethod" here for any method so that it will automatically run that method in very first
		Properties prop = new Properties();
		// there is an class in java with the help of that we can sent file as an stream that is " FileInputStream"
		// we need to give path of our file
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\ResourcesData\\GlobalData.properties"); 
		prop.load(file);
		String browserName =prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;

}
	
	public LandingPage launchApplication() throws IOException
	{
		 driver = initializeDriver();
		 LandingPage landingPage = new LandingPage(driver);
	     landingPage.goTo();
	     return landingPage;
	}
}
