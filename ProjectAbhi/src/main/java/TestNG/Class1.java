package TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;


public class Class1 {

	
	
	@Test
	 public void Abhi()
	{
		System.out.println("hii");
		Assert.assertTrue(false);
		
		
	}
	
    // with the help of TestNg we can get detailed information regarding out test cases like how many got passed of failed 
	// In TestNg we can start new test case in the single class by writing @Test 
	// In TestNg we can create XML file of our whole code 
	// if there are many test cases( Eg. 100) and we wan to run all at time then we can use XML file to run those 
	//if we want to run some particular test cases so we can exclude other test cases using exclude command in our XML file oft that test case
	// if there are 100 test cases and you only need to run 1 then we can use include command instead of using exclude for all rest one test case
	//we can run all the test cases together just by putting the name of package name in the XML file
	// if we can run our test cases "parallel" or classes then we can by just putting a line in our XMl file >>>>
	// >>parallel ="tests" thread-count ='3' or  parallel ="classes" thread-count ='3'>>>>>>>>>>>>>>>>>>>>>
    @Test(dataProvider="getData")
     public void Ashu(String userName,String Password)
    {
    	
    	System.out.println("Aayush bagala");
    	System.out.println(userName);
    	System.out.println(Password);
    	
    }
    @DataProvider
    public Object[][] getData()
    {
    	// here we are going to make 3 combination of UserName and password then we will pass this data to a particular Test case by passing name of dataProvider
    	// method in that particular test case
    	// 1st combination >>> UserName -password
    	// 2nd combination >>> UserName -password
    	// 3nd combination >>> UserName -password
    	// to fill this type of data we will use multi dimensional set of array
    	Object[][] data = new Object[3][2];
    	// 1st combination
    	data[0][0] = "firstusername";
    	data[0][1] = "password"; 
    	// 2nd set
    	data[1][0] = "Secondusername";
    	data[1][1] = "Secondpassword"; 
    	//third set
    	data[2][0] = "thirdusername";
    	data[2][1] = "thirdpassword";
    	
    	return data;
    	
    }
}
