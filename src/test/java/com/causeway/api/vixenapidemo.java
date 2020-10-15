package com.causeway.api;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class vixenapidemo {

	@Test
	public void Test1() {

		
		RestAssured.baseURI = "http://192.168.132.176:54030";
		
		  given().
		  when().
			get("/api.vixen/masterclients/id/BEN001/sites").
			then().assertThat()
			.contentType(ContentType.JSON);
			
			//and().body("links[0].rel", equalTo("next"));
		
		System.out.println("hello");
			
			
			
	}

	
	

}
