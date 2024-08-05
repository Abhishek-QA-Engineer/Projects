import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Class1 {

//	@Test
//	@AfterTest
@Parameters({ "URL" })
	@Test
	public void Abhi(String urlname)
	{
		System.out.println("hii");
		System.out.println(urlname);
		
		
	}
	
    // with the help of TestNg we can get detailed information regarding out test cases like how many got passed of failed 
	// In TestNg we can start new test case in the single class by writing @Test 
	// In TestNg we can create XML file of our whole code 
	// if there are many test cases( Ex. 100) and we want to run all at time then we can use XML file to run those 
	// if we want to run some particular test cases so we can exclude other test cases using exclude command in our XML file oft that test case
	// if we wan to execute any test case in the very first then we can by writing "@BeforeTest" and remember it will execute it first specifically within that test case
	// as well we can use "@AfterTest" for execute in the last with in that test case
	// we can use "@BeforeSuite" if we want to execute the test case before all over the test cases in that suite and "@AfterSuite" to execute in the last
	// we can use "@BeforeMethod" -- it will execute this method before all the methods every time in that class and "@AfterMethod" to execute in the last
	// In TestNG generally the Test case are executed as per the alphabetically oder
	// If there are 100 Test cases and client want to execute only 7 test case from all the test case which are from different-2 classes or test then 
	// we will use Groups >>  @Test(groups={'Smoke'}) >>. we need to write this annotation in our XML file as include then it will execute only those test case having this annotation
	// or if we use exclude instead of include in XML then it will skip those Test case only
	// If we want to execute any particular method or test before any particular method or test then we will use dependencies for that
	// Syntax >>  @Test(dependsOnMethods={'name of that method'}) 
	// we can skip any test by @Test(enabled = false) 
//  @BeforeTest
//	@Test(enabled = false)
	@Test
    void Ashu()
    {
    	
    	System.out.println("Aayush bagala");
    	
    }
}
