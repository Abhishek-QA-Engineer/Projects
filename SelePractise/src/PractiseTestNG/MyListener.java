package PractiseTestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener
{
	
	 public void onStart(ITestContext context) {
		   System.out.println("Test Execution start...");
		  }
	 
	 public void onTestStart(ITestResult result) {
		 System.out.println("Test Started...");
		 
		  }
	 
	 public void onTestSuccess(ITestResult result) {
		 System.out.println("Test Success...");
		 
		  }
	 public void onTestFailure(ITestResult result) {
		 System.out.println("Test failed...");
		    
		  }
	 public void onTestSkipped(ITestResult result) {
		 System.out.println("Test skipped...");
		   
		  }
	 public void onFinish(ITestContext context) {
		 System.out.println("Test Execution completed...");
		  
		  }
	 
	

}
