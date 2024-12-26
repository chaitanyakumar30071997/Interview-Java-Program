package com.scanner;

import java.util.Scanner;

public class Even_Add {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter any number ");
		int num = scanner.nextInt();
		
		if(num%2 == 0) {
			System.out.println("Its is even number ");
			
		}else {
			System.out.println("Its add Number");
		}
		
		scanner.close();
	}
}
