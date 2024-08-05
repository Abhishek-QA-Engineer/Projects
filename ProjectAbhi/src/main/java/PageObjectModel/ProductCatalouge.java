package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponentAll.abstractComponent;

public class ProductCatalouge extends abstractComponent {
WebDriver driver;
	
	public ProductCatalouge(WebDriver driver)
	{
		super(driver);
		//initialization
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(css=".mb-3")
	List<WebElement> products;
	
	@FindBy(css=".ng-animating")
	WebElement spinner;
	
	By productsBy = By.cssSelector(".mb-3");
	By addToCart = By.cssSelector(".card-body button:last-of-type");
	By toastMessage = By.id("toast-container");
	
	
	
	public List<WebElement> getProductList()
	{
		WaitForElementToAppear(productsBy);
		return products;
	}
	
	public WebElement  getProductByName(String productName)
	{
		
		WebElement product = getProductList().stream().filter(p->p.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
	    return product;
	}
	

	public void addProductToCart(String productName)
	{
		WebElement product = getProductByName(productName);
		product.findElement(addToCart).click();
		WaitForElementToAppear(toastMessage);
		// below item is expecting WebElement so we are using factory data
		WaitForElementToDisappear(spinner);
		
	}


}
