package com.causeway.api;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.causway.files.Payload;
import com.causway.files.Resources;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateReactiveJob {

	Properties prop1 = new Properties();
	
	@BeforeTest
	public void getData() throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Komal.Chowdhary\\eclipse-workspace\\RestAssuredDemo\\src\\Files\\env.properties");
		prop1.load(fis);
		
		
	}
	
	
@Test	
public void Test1() {

		
		RestAssured.baseURI = prop1.getProperty("HOST");
		
		Response res = 
				
				given().
		 
		  body(Payload.getPayload()).
		  
		  when().
		  
		  post(Resources.placepostData()).
		  
		  then().assertThat().contentType(ContentType.HTML)
		  
		  . extract().response();
		  
	
		  
		  
	String responsestring = res.getBody().asString();
		
		System.out.println(responsestring);
	
	
	
}
}
