package com.sanjeev.java;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        String input1 = scan.nextLine();
        double d1 = Double.parseDouble(input1);

        System.out.println("Enter the second number");
        String input2 = scan.nextLine();
        double d2 = Double.parseDouble(input2);

        double result = d1 + d2;
        System.out.println("The answer is: " + result);
    }

}
