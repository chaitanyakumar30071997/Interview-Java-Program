package com.scanner;

import java.util.Scanner;

public class Student_Pass_Fail {
	
	public static void main(String[] args) {
	
     Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter your Markas");
	 int marke = scanner.nextInt();
	 
	 if(marke< 35 ) {
		 System.out.println("Your fail");
		 
	 }else if(marke >= 35 && marke <= 55) {
		 System.out.println("Your just pass");
		 
	 }else if(marke >= 56 && marke <= 75) {
		 System.out.println("Your threee class");
		 
	 }else if(marke >= 76 && marke <= 85) {
		 System.out.println("your second class");
		 
	 }else {
		 System.out.println("Your first class ");
	 }
	 
	 scanner.close();
	 
	}
	
}
