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
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;



public class PaginationReactiveJobs {

	
	Properties prop=new Properties();
	
	@BeforeTest
	public void getData() throws IOException
	{
		
		FileInputStream fis=new FileInputStream("C:\\RestAssured\\src\\test\\java\\com\\causway\\files\\env.properties");
		prop.load(fis);
		
		
	}

@Test

	public void Test1() {

		
		RestAssured.baseURI = prop.getProperty("HOST");
		
		 Response response =  given().
		  param("company","01").
		  param("sitesstartfrom", Payload.Sitestart() ).log().all().
		  when().
			get(Resources.placegetData()).
			then().assertThat()
			//.contentType(ContentType.JSON).log().body().
			.contentType(ContentType.JSON).
			extract().response();
			
			

		String responsestring = response.asString();
		
		JsonPath js = new JsonPath(responsestring);

		
		System.out.println("JobId is " +  js.get("masterClients[0].clients[0].sites[0].jobsReactive[0].jobId"));
		
 int count = js.get("masterClients[0].clients[0].sites[0].jobsReactive.size()");

	System.out.println(count);
		 
		// System.out.println("The number of sites " + count);
		 
		// for(int i=0;i<count;i++) {
		//	 System.out.println( " The JobId is " + js.get("masterClients[0].clients[0].sites[0].jobsReactive["+i+"].jobId "));
			 
		 //}
	
}
}
