package PageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponentAll.abstractComponent;

public class CartPage extends abstractComponent {

	WebDriver driver;
	
	
	public CartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css=".cartSection h3")
	List<WebElement> cartProducts;
	
	//.totalRow button
	@FindBy(css=".totalRow button")
	WebElement checkoutEle;
	
	public Boolean VerifyProductDisplay(String productName)
	{
		boolean match = cartProducts.stream().anyMatch(cartProduct->cartProduct.getText().equalsIgnoreCase(productName));
		return match;
	}
	
	public void goToCheckout()
	{
		checkoutEle.click();
	}
	
}
