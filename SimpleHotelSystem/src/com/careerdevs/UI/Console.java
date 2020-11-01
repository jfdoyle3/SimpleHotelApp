package com.careerdevs.UI;

public class Console {

	public static void welcome() {
		System.out.println("Welcome to Summit Hotel");
	}
	
	public static void guestsMessage() {
		System.out.print("How many guests? ");
	}
	
	public static void checkInMessage(int guests) {
		System.out.printf("\n%d guests checked into hotel",guests);
	}
	
	public static void checkOutMessage(int guests) {
		System.out.printf("\n%d guests checked out of hotel", guests);
	}
	
	public static void roomAvailable(int room) {
		System.out.printf("\n%d rooms left", room);
	}
	public static void hotelFull() {
		System.out.println("No more rooms left");
	}
	public static void hotelEmpty() {
		System.out.println("Hotel is empty of guests");
	}
	
	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	} 
}
