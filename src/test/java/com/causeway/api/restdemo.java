package com.causeway.api;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class restdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//RestAssured.baseURI = "http://192.168.132.176:54030";
		
		RestAssured.baseURI = "http://something.com";
		
       given().when().
		get("http://google.com").then().assertThat().statusCode(200);
		
	
		
		     }



}
