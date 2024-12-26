package com.scanner;

import java.util.Scanner;

public class Weenday_weenEnd_TypeTwo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your weenday ");
		String day = scanner.nextLine().trim().toLowerCase();
		
		if(day.equals("monday")  || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday")) {
			System.out.println("This is Weenday");
			
		}else if(day.equals("saturday") || day.equals("sunday")) {
			System.out.println("This weenEnd ");
			
		}else {
			System.out.println("invail Ans");
		}
		
		scanner.close();
	}
}
