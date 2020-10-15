package com.causeway.api;



	
	import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
	 

public class SitesOfMasterClient {
	 
	 @Test
	 public void GetSiteDetails()
	 {   
	 // Specify the base URL to the RESTful web service
	 RestAssured.baseURI = "http://192.168.132.176:54030/api.vixen/masterclients/id/";
	 
	 // Get the RequestSpecification of the request that you want to sent
	 // to the server. The server is specified by the BaseURI that we have
	 // specified in the above step.
	 RequestSpecification httpRequest = RestAssured.given().log().all();
	 
	 // Make a request to the server by specifying the method Type and the method URL.
	 // This will return the Response from the server. Store the response in a variable.
	 Response response = httpRequest.request(Method.GET, "KEN001/sites");

	 // Now let us print the body of the message to see what response
	 // we have received from the server
	 String responseBody = response.getBody().asString();
	 System.out.println("Response Body is: " + responseBody);
	 
	 int statusCode = response.getStatusCode();
	 System.out.println(statusCode);
	 
	// Assert that correct status code is returned.
	 Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/, "Correct status code returned");

	// Get the status line from the Response and store it in a variable called statusLine
	 String statusLine = response.getStatusLine();
	 Assert.assertEquals(statusLine /*actual value*/, "HTTP/1.1 200 " /*expected value*/, "Correct status code returned");
	 
	 
	
	 
	// First get the JsonPath object instance from the Response interface
	 JsonPath jsonPathEvaluator = response.jsonPath();
	 //Get the first SiteId
	 
		 System.out.println(" The Site is " + jsonPathEvaluator.get("masterClients.clients[0].sites[0].siteId[0]"));
	 
		 int count = jsonPathEvaluator.get("masterClients[0].clients[0].sites.size()");
		 
		 System.out.println("The number of sites " + count);
		 
		 for(int i=0;i<count;i++) {
			 System.out.println( " The SiteId is " + jsonPathEvaluator.get("masterClients[0].clients[0].sites["+i+"].siteId "));
			 
		 }
		 
		 
	 }
	 
	 
	 
	}
	
	
	

