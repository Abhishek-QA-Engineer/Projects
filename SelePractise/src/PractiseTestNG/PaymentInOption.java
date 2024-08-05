package PractiseTestNG;

import org.testng.annotations.Test;

public class PaymentInOption {
	
	@Test(priority=1, groups= {"Sanity","Regression"})
	void paymentByUpi()
	{
		System.out.println("payment by upi");
		
	}
	
	@Test(priority=1, groups= {"Sanity","Regression"})
	void paymentByGooglePay()
	{
		System.out.println("payment by Gpay");
		
	}

}
