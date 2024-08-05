package package1;

import files.payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// as currently we do not ahve any API for this course price JSON so we are using like that whenever we will have 
		// API for this then we can simply replace "payload course price method" with real API 
		JsonPath js =new JsonPath(payload.CoursePrice()); 
		
		//print no. of courses return by api
		int count =js.getInt("courses.size()");
		System.out.println(count);
		
		// print purchase amount
	    int amount=	js.getInt("dashboard.purchaseAmount");
	    System.out.println(amount);
	    
	    // print title of first course
	   String titleCourse1= js.get("courses[0].title");
	   System.out.println(titleCourse1);
	   
	   // print title of all courses and price 
	   for(int i=0;i<count;i++)
	   {
		 String courseTitles=  js.get("courses["+i+"].title");
	     System.out.println(js.get("courses["+i+"].price"));
	     System.out.println(courseTitles);
	   }
	   
	   // print no. of copies sold by RPA
	   for(int i=0;i<count;i++)
	   {
		 String courseTitles = js.get("courses["+i+"].title");
		 if(courseTitles.equalsIgnoreCase("RPA"))
		 {
			int copies= js.get("courses["+i+"].copies");  
			System.out.println(copies);
			break;
			 
		 }
				 
	   }
	   
	   
		

	}

}
