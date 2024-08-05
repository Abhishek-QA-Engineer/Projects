package PractiseTestNG;

import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(priority=1, groups= {"Sanity"})
	void loginByEmail()
	{
		System.out.println("login by email");
	}
	
	@Test(priority=2, groups= {"Sanity"})
	void loginByFacebook()
	{
		System.out.println("login by facbook");
	}
	
	@Test(priority=3, groups= {"Sanity"})
	void loginByInsta()
	{
		System.out.println("login by Insta");
	}



}
