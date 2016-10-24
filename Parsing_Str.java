package com.sanjeev.java;

public class Parsing_Str {
    public static void main(String[] args) {
        String s1 = "Welcome to Perth";
        System.out.println("Length of string: " + s1.length() );

        int position = s1.indexOf("Perth");
        System.out.println("position of substring: " + position);

        String sub = s1.substring(11);
        System.out.println(sub);
    }
}
