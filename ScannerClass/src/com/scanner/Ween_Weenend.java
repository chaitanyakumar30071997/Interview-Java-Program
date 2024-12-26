package com.scanner;
import java.util.Scanner;

public class Ween_Weenend {

	public static void main(String[] args) {
		   
		        Scanner scanner = new Scanner(System.in);
		        
		        // Prompt the user to enter a day
		        System.out.print("Enter a day of the week (e.g., Monday, Tuesday): ");
		        String day = scanner.nextLine().trim().toLowerCase();

		        // Check if the input is a weekday or weekend
		        switch (day) {
		            case "monday":
		            case "tuesday":
		            case "wednesday":
		            case "thursday":
		            case "friday":
		                System.out.println(day.substring(0, 1).toUpperCase() + day.substring(1) + " is a weekday.");
		                break;
		            case "saturday":
		            case "sunday":
		                System.out.println(day.substring(0, 1).toUpperCase() + day.substring(1) + " is a weekend.");
		                break;
		            default:
		                System.out.println("Invalid input! Please enter a valid day of the week.");
		                break;
		        }

		        scanner.close();
		    }
		
		
	}


