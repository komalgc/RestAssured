package com.causway.files;

public class Resources {

	public static String placegetData() {

		String getres = "api.vixen/masterclients/id/KEN001/jobs/reactive";

		return getres;

	}

	public static String placepostData() {

		String postres = "/api.vixen/jobs/reactive";
		return postres;

	}

	//Get Reactive jobs from SQL DB
	
	public static String getreactivejobdb() {

		String getreac = "/api.vixen/rd/masterclients/id/019861/jobs/reactive";
		return getreac;

	}

	//Get planned jobs from SQL DB
	
	public static String getplannedjobdb() {
		
		String getplann = "/api.vixen/rd/masterclients/id/ZZZ999/jobs/planned";
		 return getplann;
	}


	//Get planned jobs from ISAM

	public static String getplannedjobisam() {

		String getplann = "/api.vixen/masterclients/id/ZZZ999/jobs/planned";
		return getplann;
	}


}
