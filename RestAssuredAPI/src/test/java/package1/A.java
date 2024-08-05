package package1;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import  static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import files.payload;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Basically RestAssured works on three main method ---->>
	// a) given--> all the details comes under given like body/headers/parameters ....
	// b) when-->> submit the API means it will help to submit the API by using methods like PUT/GET/POST...etc
		         // Resources and HTTP method comes here
	// c) then->>> validate the response using assert ....
		
		
		// write code to add place 

		
	RestAssured.baseURI="https://rahulshettyacademy.com";
	String response =	given().log().all().queryParam("key", "qaclick123").header("content-Type","application/json")
		.body(payload.AddPlace()).when().post("maps/api/place/add/json")
		 .then().assertThat().statusCode(200).body("scope",equalTo("APP"))
		 .header("Server","Apache/2.4.52 (Ubuntu)" ).extract().response().asString();
	
	 System.out.println(response);
		
	// we can perform any no. of validation
    // Add place-->>Update place with new address-->>Get place to validate if new address is there or not
	// we can extract response by using extract()--method ---then can store in variable	
	 
	// if we want to extract any particular data or id then we have to write customize code for that 
	// there is class--JsonPath--->> in which we can take input as string and then convert into JSON
	// basically it will help us in parsing of JSON
	 
	 //>>>> extract place id from above response by writing path for place id JSON
	 
	 JsonPath js =  new JsonPath(response);
	 String placeId= js.get("place_id");  // here we have to provide path of our data which we want to extract from JSON
	
	 System.out.println(placeId);
	 
	 // Update place
	 // creating new variable for new address so that we can use that variable wherever we need and also no need to update body every time while updating address
	 String newAddress = "70 Summer walk, USA-Noida k rehne wale";
	 
	 given().log().all().queryParam("key","qaclick123").header("content-Type","application/json")
	 .body("{\r\n"
	 		+ "\"place_id\":\""+placeId+"\",\r\n"
	 		+ "\"address\":\""+newAddress+"\",\r\n"
	 		+ "\"key\":\"qaclick123\"\r\n"
	 		+ "}").
	 when().put("maps/api/place/update/json").
	 then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));
	 
	 //Get place---note--header and body is not required in the GET method but we have to give place id to extract the updated place
	 String getPlaceResponse= given().log().all().queryParam("key","qaclick123").queryParam("place_id", placeId).
	 
	 when().get("maps/api/place/get/json").
	 then().assertThat().log().all().statusCode(200).extract().response().asString();
	 
	 // now we will use JsonPath class to extract the address from above string response
	 
	 JsonPath js1 =new JsonPath(getPlaceResponse);
	 String actualAddress=  js1.getString("address");
	 
	 System.out.println(actualAddress);
	 
	 Assert.assertEquals(actualAddress, newAddress);
			 
		
		
		
		
	}

}
