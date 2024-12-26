package com;
import java.util.Scanner;

public class EmployeeFamilyDetails {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Asking employee if married
	        System.out.println("Are you married? (yes/no): ");
	        String maritalStatus = scanner.nextLine();

	        // If married, asking for wife's details and children
	        if (maritalStatus.equalsIgnoreCase("yes")) {
	            System.out.print("Enter your wife's name: ");
	            String wifeName = scanner.nextLine();

	            System.out.print("How many children do you have? ");
	            int childrenCount = scanner.nextInt();
	            scanner.nextLine();  // Clear the newline character

	            System.out.println("Details of your children:");
	            for (int i = 1; i <= childrenCount; i++) {
	                System.out.print("Enter the name of child " + i + ": ");
	                String childName = scanner.nextLine();
	                System.out.println("Child " + i + ": " + childName);
	            }

	        } else { // If not married, asking for family details
	            System.out.print("Enter your father's name: ");
	            String fatherName = scanner.nextLine();

	            System.out.print("Enter your mother's name: ");
	            String motherName = scanner.nextLine();

	            System.out.print("Do you have any brothers? (yes/no): ");
	            String hasBrothers = scanner.nextLine();

	            if (hasBrothers.equalsIgnoreCase("yes")) {
	                System.out.print("How many brothers do you have? ");
	                int brothersCount = scanner.nextInt();
	                scanner.nextLine();  // Clear the newline character
	                for (int i = 1; i <= brothersCount; i++) {
	                    System.out.print("Enter the name of brother " + i + ": ");
	                    String brotherName = scanner.nextLine();
	                    System.out.println("Brother " + i + ": " + brotherName);
	                }
	            }

	            System.out.print("Do you have any sisters? (yes/no): ");
	            String hasSisters = scanner.nextLine();

	            if (hasSisters.equalsIgnoreCase("yes")) {
	                System.out.print("How many sisters do you have? ");
	                int sistersCount = scanner.nextInt();
	                scanner.nextLine();  // Clear the newline character
	                for (int i = 1; i <= sistersCount; i++) {
	                    System.out.print("Enter the name of sister " + i + ": ");
	                    String sisterName = scanner.nextLine();
	                    System.out.println("Sister " + i + ": " + sisterName);
	                }
	            }
	        }

	        scanner.close();
	    }
	}


