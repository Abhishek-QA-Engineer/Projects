package TestNG;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectModel.CartPage;
import PageObjectModel.Checkout;
import PageObjectModel.ProductCatalouge;
import TestComponents.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ErrorValidation extends BaseTest {

	    @Test
	    public void StandAloneTest() throws IOException, InterruptedException
	    {
		// TODO Auto-generated method stub
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		driver.get("https://www.rahulshettyacademy.com/client");
//		LandingPage landingPage = new LandingPage(driver);
//		landingPage.goTo(); 	
//		String productName = "ZARA COAT 3";
		LandingPage landingPage = launchApplication();


		landingPage.loginApplication("abhishektanwar841@gmail.com", "Abhi@07");	
		
		
		
		
//		ProductCatalouge productCatalouge = new ProductCatalouge(driver);
//		List<WebElement> products =productCatalouge.getProductList();
//		productCatalouge.addProductToCart(productName);
//		productCatalouge.goToCartPage();
//		CartPage cartPage = new CartPage(driver);
//	    Boolean match  =	cartPage.VerifyProductDisplay(productName);
//	    // validation will remain in the code means they will not go in the page object as page object have only code to perform action but if we are validating
//	    // something that should be in our test case only
//	    Assert.assertTrue(match);
//	    cartPage.goToCheckout();
//	    Thread.sleep(5000);
//	    Checkout checkOut = new Checkout(driver);
//	    checkOut.SelectCounrty();
//	    Thread.sleep(3000);
//	    checkOut.JavaScriptScroll();
//	    checkOut.PlaceOder();
	    
	    
	    
	    
	    
	    // up to this for every page creation we have one object is there but we can handle this in another smart way
	    
//		driver.findElement(By.id("userEmail")).sendKeys("abhishektanwar841@gmail.com");
//		driver.findElement(By.id("userPassword")).sendKeys("Abhi@0707");
//		driver.findElement(By.id("login")).click();
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		
//		 List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
		 
		 // In the below line we are using product.findElement instead of driver.find... as driver.find.. will search the element on the whole page whereas the
		 // product.find... will find the element with in that product only as we are already selected that product....
//		WebElement product = products.stream().filter(p->p.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
//		product.findElement(By.cssSelector(".card-body button:last-of-type")).click();
//		
		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
//		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
//		
//		driver.findElement(By.cssSelector(".fa.fa-shopping-cart")).click();
		
		// now we are going to check weather the selected item is correct one or not as per our selection >>>>>>>>>>>>>
//	    List<WebElement> cartProducts=	driver.findElements(By.cssSelector(".cartSection h3"));
	    // below method will give us true if item present or will give false if not
//	   boolean match = cartProducts.stream().anyMatch(cartProduct->cartProduct.getText().equalsIgnoreCase(productName));
//		Assert.assertTrue(match);
//		driver.findElement(By.cssSelector(".totalRow button")).click();
		//  button .ng-star-inserted 
//		driver.findElement(By.xpath("//input[@placeholder='Select Country']")).sendKeys("ind");
//		List<WebElement> selectCountry = driver.findElements(By.cssSelector("button .ng-star-inserted"));
//	    WebElement c = selectCountry.stream().filter(country->country.getText().equals("India")).findFirst().orElse(null);
//	    c.findElement(By.cssSelector("button span i")).click();
//	    Thread.sleep(5000);
//	    JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,500)");
//		Thread.sleep(2000);
//		js.executeScript("document.querySelector('.actions a').scrollTop=5000");
//	    driver.findElement(By.cssSelector(".actions a")).click();
//	    System.out.println(driver.findElement(By.cssSelector("tbody tr td label.ng-star-inserted")).getText()); 
	   
//	    
//	    
	    
	    
	   
	  
		
		 
	     	

	}

}
