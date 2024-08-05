package PractiseTestNG;

import org.testng.annotations.Test;

public class TestClass {
	
	@Test(priority=1)
	void test()
	{
      int x=10;
      int y=16;
      
      if(x==y)
      {
    	  System.out.println("Test Passed");
      }
      else 
      {
    	  System.out.println("Test Failed"); 
      }
     
	}
	
	@Test(priority=2)
	void test1() {
		
		System.out.println("testing 2nd");
	}

}
