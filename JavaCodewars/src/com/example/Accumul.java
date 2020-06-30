package com.example;

//This time no story, no theory. The examples below show you how to write function accum:
//
//        Examples:
//
//        accum("abcd") -> "A-Bb-Ccc-Dddd"
//        accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
//        accum("cwAt") -> "C-Ww-Aaa-Tttt"
//        The parameter of accum is a string which includes only letters from a..z and A..Z.

public class Accumul {
    public static String accum(String s) {

        String res = "";

        for (int i = 0; i < s.length(); i++) {

            res += s.toUpperCase().charAt(i);
            for (int j = 0; j < i; j++) {

                res += s.toLowerCase().charAt(i);

            }

            if (i != s.length() - 1) res += "-";
        }
        return res;
    }
}
