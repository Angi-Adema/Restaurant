package com.adema.restaurant;

public class Location {
	
	public static void main(String[] args) {
		
		// PSEUDOCODE
		// 1. Create variables holding: 
		//      restaurantName, 
		//      businessAddress, 
		//      city, 
		//      state, 
		//      zip
		// 2. Print restaurant name moving cursor to next line.
		// 3. Print business address moving cursor to next line.
		// 4. Print city, state and zip moving cursor to next line.
		
		// Variables
		String restaurantName = "Flemmings";
		String businessAddress = "191 Inverness Drive West";
		String city = "Englewood";
		String state = "CO";
		int zip = 80112;
		
		// Restaurant name print statement.
		System.out.println(restaurantName);
		
		// Business address print statement.
		System.out.println(businessAddress);
		
		// Print statement for city, state and zip.
		System.out.println(city + ", " + state + ", " + zip);
		
	}
}
