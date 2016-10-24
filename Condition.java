package com.sanjeev.java;


public class Condition {
    public static void main(String[] args) {
        int monthNumber = 13;
        if (monthNumber >=1 && monthNumber<= 3){
            System.out.println("You are in first quarter");
        }else if (monthNumber>=4 && monthNumber<= 6) {
            System.out.println("You are in second quarter");
        }else if (monthNumber>=7 && monthNumber<= 9) {
            System.out.println("You are in third quarter");
        }else if (monthNumber>=10 && monthNumber<= 12) {
            System.out.println("You are in fourth quarter");
        } else {
            System.out.println("That's an unknown month");
        }
    }
}
