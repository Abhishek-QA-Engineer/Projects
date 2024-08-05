package PractiseTestNG;

import org.testng.annotations.Test;

public class LogoutTest {

	
	@Test(priority=1, groups= {"Regression"})
	void logoutByEmail()
	{
		System.out.println("logout by email");
	}
	
	@Test(priority=1, groups= {"Regression"})
	void logoutByFacbook()
	{
		System.out.println("logout by facbook");
	}
	
	@Test(priority=1, groups= {"Regression"})
	void logoutByInsta()
	{
		System.out.println("logout by insta");
	}
}
