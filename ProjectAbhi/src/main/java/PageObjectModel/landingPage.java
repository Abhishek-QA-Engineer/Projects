package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponentAll.abstractComponent;

public class landingPage extends abstractComponent {
WebDriver driver;
	
	public landingPage(WebDriver driver)
	{
		super(driver);
		//initialization
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	@FindBy(id="userPassword")
	WebElement passwordEle;
	
	@FindBy(id="login")
	WebElement submit;
	
	@FindBy(css="[class*='flyInOut']")
	WebElement errorMessage;
	
	public void loginApplication(String email, String password) 
	{
		userEmail.sendKeys(email);
		passwordEle.sendKeys(password);
		submit.click();
		
	}
	
	public void getErrorMessage()
	{
		WaitForWebElementToAppear(errorMessage);
		errorMessage.getText();
	}
	
	public void goTo()
	{
		driver.get("https://www.rahulshettyacademy.com/client"); 
	}
	
	


}
