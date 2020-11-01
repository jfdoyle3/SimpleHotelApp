package com.careerdevs.objects;

public class Hotel {

	private String hotelName;
	private boolean guestStatus;
	private String firstName;
	private String lastName;
	private String name;
	
	public Hotel (String hotelName, String firstName, String lastName) {
		
		this.name=firstName+" "+lastName;
		this.firstName=firstName;
		this.lastName=lastName;
		this.hotelName=hotelName;

	}
	
	public void guestCheckIn() {
		
	}
	
	public void guestCheckOut() {
		
	}
	
}
