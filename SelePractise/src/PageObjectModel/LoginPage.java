package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	
	  WebDriver driver;
	 
	 // Constructor
	 LoginPage(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 
	 //Locators
	By txtUserEmail_loc =  By.xpath("//input[@id='input-email']");
	By txtPassword_loc =   By.xpath("//input[@id='input-password']");
	By btnLogin_loc =      By.xpath("//input[@class='btn btn-primary']");
	
	
	// Action Methods
	
	public void setUserEmail(String Email)
	{
		driver.findElement(txtUserEmail_loc).sendKeys(Email);
	}
	
	public void setPassword(String pwd)
	{
		driver.findElement(txtPassword_loc).sendKeys(pwd);
		
	}
	
	public void clickLogin()
	{
		driver.findElement(btnLogin_loc).click();
	}
	
	
}
