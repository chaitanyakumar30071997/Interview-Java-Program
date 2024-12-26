package com.scanner;

import java.util.Scanner;

public class Add_Two_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number:");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter the operation (+, -, *, /, %):");
        String operation = scanner.next();

        int result;

        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            case "%":
                result = firstNumber % secondNumber;
                break;
            default:
                throw new IllegalArgumentException("Unexpected operation: " + operation);
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
