package com.causway.files;

public class Payload {

	
	public static String getPayload() {
	
		
		String b = " {\"companyNumber\": \"01\",\r\n" + 
		  		" \"contact\": \"John\",\r\n" + 
		  		" \"contract\" : \"100241\",\r\n" + 
		  		"  \"jobType\": 3,\r\n" + 
		  		" \"description\": \"New Call Out\",\r\n" + 
		  		" \"siteAccount\": \"KEN001\",\r\n" + 
		  		" \"jobId\": \"\" ,\r\n" + 
		  		" \"orderNumber\": \"AKP-NEW\",\r\n" + 
		  		" \"engineer\": \"*BH\",\r\n" + 
		  		" \"priority\": \"1\",\r\n" + 
		  		" \"jobText\" : \"This is a new job creation text\",\r\n" + 
		  		" \"appointmentDate\": \"2019-12-15T10:12:13.012Z\",\r\n" + 
		  		"\r\n" + 
		  		" \"sorlist\": [\r\n" + 
		  		" 	{\r\n" + 
		  		" 		\"nonScheduleSOR\" : \"false\",\r\n" + 
		  		" 	    \r\n" + 
		  		" 	    \"sorCode\" : \"000001\",\r\n" + 
		  		" 	    \"sorQty\" : 1\r\n" + 
		  		" 	}\r\n" + 
		  		" 		],\r\n" + 
		  		" 		\"subJobNo\" : \"\"\r\n" + 
		  		" 	\r\n" + 
		  		" 	\r\n" + 
		  		" }";
		
		
		return b;
	
}
	
	public static String Count() {
		
		String count = "0";
		return count;
	}
	
	public static String Sitestart() {
		
		String Siteno = "KEN001";
		
		return Siteno;
	}
		
		
		
		public static String FmDate() {
			
			String fromdate  = "2019-01-01";
			return fromdate;
			
					
					
		}
		
	public static String ToDate() {
			
			String todate  = "2019-12-01";
			return todate;
			
					
					
		}
	
	
public static String incfoll() {
		
		String incfollowon  = "true";
		return incfollowon;
		
				
				
	}
	}
	

