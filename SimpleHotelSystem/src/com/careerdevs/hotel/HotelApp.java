package com.careerdevs.hotel;



import com.careerdevs.UI.Console;
import com.careerdevs.UI.Input;
import com.careerdevs.objects.Hotel;

public class HotelApp {

	public static void hotelApp() {
		Console.welcome();
		Hotel hotel=new Hotel(20);
		Console.guestsMessage();
		int guests=Input.inputInt();
		Console.checkInMessage(guests);
		hotel.guestCheckIn(guests);
		Console.clearScreen();
		
		
	}
}
