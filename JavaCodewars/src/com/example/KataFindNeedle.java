package com.example;

import java.util.Arrays;

public class KataFindNeedle {
    public static String findNeedle(Object[] haystack) {
        return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");
    }
}

//    public static String findNeedle(Object[] haystack) {
//
//        for (int i = 0; i < haystack.length; i++) {
//            if (haystack[i] == "needle") {
//                return "found the needle at position " + i;
//            }
//        }
//        return "no needle found";
//    }