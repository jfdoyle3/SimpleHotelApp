package com.careerdevs.objects;

import com.careerdevs.UI.Console;

public class Hotel {

	private int rooms;

	public Hotel(int rooms) {
		this.rooms = rooms;
	}

	public void guestCheckIn(int guests) {
		if (rooms == 0) {
			Console.hotelFull();
		} else {
			rooms = rooms - guests;
			Console.roomAvailable(rooms);
		}
	}

	public void guestCheckOut(int guests) {
		if (rooms < 0) {
			Console.hotelEmpty();
		} else {
			rooms = rooms + guests;
		}
		Console.checkOutMessage(guests);
	}

}
