package com.careerdevs.UI;

import java.util.Scanner;

public class Input {
	
	private static Scanner input=new Scanner(System.in);
	
	public static int inputInt() {
		return input.nextInt();
	}
	
	public static String inputString() {
		return input.nextLine();
	}
	
	
}
