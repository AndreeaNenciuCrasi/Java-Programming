package com.example;

public class ReverseString {
    public static String solution(String str) {
        // Your code here...
        String newcad="";

        for(int i = str.length()-1; i >= 0; i--){
            newcad += str.charAt(i);
        }

        return newcad;
    }
}

//    public static String solution(String str) {
//        return new StringBuilder(str).reverse().toString();
//    }
