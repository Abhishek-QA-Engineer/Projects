package PageObjectModel;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponentAll.abstractComponent;

public class Checkout extends abstractComponent{
	
	WebDriver driver;

	public Checkout(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Select Country']")
	WebElement Country;
	
	@FindBy(css="button .ng-star-inserted")
	List<WebElement> selectCountry;
	
	@FindBy(css="button span i")
	WebElement c;
	
	@FindBy(css=".actions a")
	WebElement placeOder;
	
	public void SelectCounrty()
	{
		Country.sendKeys("ind");
		c = selectCountry.stream().filter(country->country.getText().equals("India")).findFirst().orElse(null);
		c.click();
		
	}
	
	public void PlaceOder()
	{
		placeOder.click();
	}
	
//	public void JavaScriptScroll() throws Exception
//	{
//	    
//	    JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,500)");                
//		Thread.sleep(2000);
//		js.executeScript("document.querySelector('.actions a').scrollTop=5000");                                          
//		
//	}  
	

	
	
}
