package com.sanjeev.java;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sanjeev =  new Scanner(System.in);
        double fnum, snum, answer;
        System.out.println("Enter the first number");
        fnum = sanjeev.nextDouble();
        System.out.println("Enter the second number");
        snum = sanjeev.nextDouble();
        answer = fnum + snum;
        System.out.println("The answer is" + answer);
    }
}
