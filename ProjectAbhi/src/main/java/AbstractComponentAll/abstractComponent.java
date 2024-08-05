package AbstractComponentAll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class abstractComponent {
	
	WebDriver driver;
	
	public abstractComponent(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".fa.fa-shopping-cart")
	WebElement cartHeader;
	
	@FindBy(css=".actions a")
	WebElement scrollWindow;
	
	public void WaitForElementToAppear(By FindBY)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		
	}
	
	public void WaitForWebElementToAppear(WebElement findby)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOf(findby));
	}	
	
	public void goToCartPage()
	{
		cartHeader.click();
	}
	
	public void WaitForElementToDisappear(WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOf(ele));
	}
	
	public void JavaScriptScroll() throws InterruptedException
	{
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");                
        Thread.sleep(2000);
		js.executeScript("document.querySelector('.actions a').scrollTop=5000");                          
		
	}  

}
