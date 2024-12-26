package com.scanner;

import java.util.Scanner;

public class Even_ODD_Switch {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Any number ");
		int num = scanner.nextInt();
		int rem = num%2;
		switch (rem) {
		case 0: {
			System.out.println("This EvEn Number");	
			break;
		}case 1 :{
			System.out.println("This Odd Numbers ");
		}
		
		
		}
		scanner.close();
		
	}

}
