package com.sonic;

public class HelloStrings {
    public static void main(String[] args) {
        String name = "Sonic";
        String nameinuppercase = name.toUpperCase();
        System.out.println(nameinuppercase);
        String nameinlowercase = name.toLowerCase();
        System.out.println(nameinlowercase);
        int charactersinname = name.length();
        System.out.println("There are " + charactersinname + " characters in my name");
    }
}
