package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

import files.payload;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.*;
public class sumValidation {
	
    @Test
	public void sumOfCourses()
	{
		JsonPath js =new JsonPath(payload.CoursePrice());
		int count =js.getInt("courses.size()");
		int sum=0;
		for(int i=0;i<count;i++)
	    {
		int copies= js.get("courses["+i+"].copies"); 
		int price = js.get("courses["+i+"].price") ;
		int amount = price*copies;
		System.out.println(amount);
		sum =sum + price*copies;
		
	    }
		System.out.println(sum);
		int amountExpected=	js.getInt("dashboard.purchaseAmount");
		Assert.assertEquals(sum, amountExpected);
		
	}

}
