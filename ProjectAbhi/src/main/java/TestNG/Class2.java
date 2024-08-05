package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class2 {

	@Test
	void Mahadev()
	{
		System.out.println("Shaktiman");
		
		
	}
	
    // with the help of TestNg we can get detailed information regarding out test cases like how many got passed of failed 
	// In TestNg we can start new test case in the single class by writing @Test 
	// In TestNg we can create XML file of our whole code 
	// if there are many test cases( Eg. 100) and we wan to run all at time then we can use XML file to run those 
	//if we want to run some particular test cases so we can exclude other test cases using exclude command in our XML file oft that test case
    @Test
    @Parameters({"URL","API KEY"})
    void Guru(String urlname,String Key)
    {
    	
    	System.out.println("Father Bapu");
    	System.out.println(urlname);
    	System.out.println(Key);
    }
}
