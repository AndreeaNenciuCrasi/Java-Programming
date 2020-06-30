package com.example;

//Simple, given a string of words, return the length of the shortest word(s).
//
//        String will never be empty and you do not need to account for different data types.


import java.util.Arrays;
import java.util.stream.Stream;

public class KataShortestWord {
    public static int findShort(String s) {
        return Stream.of(s.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }
}

//    public static int findShort(String s) {
//        return Arrays.stream(s.split(" ")).mapToInt(String::length).min().getAsInt();
//    }