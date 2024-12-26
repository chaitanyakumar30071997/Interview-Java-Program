package com.scanner;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();

        System.out.println("Enter any 5 numbers:");
        for (int i = 0; i < 5; i++) {
            num.add(sc.nextInt());
        }
        System.out.println("The numbers you entered:");
        for (int number : num) {
            System.out.println(number);
        }

        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < num.size(); i++) {
            int currentNumber = num.get(i);
            String stringValue = String.valueOf(currentNumber);
            map.put(currentNumber, stringValue);
        }
        System.out.println("Converted HashMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
