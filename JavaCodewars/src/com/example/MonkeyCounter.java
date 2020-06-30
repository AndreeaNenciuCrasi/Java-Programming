package com.example;

import java.util.stream.IntStream;

public class MonkeyCounter {
    public static int[] monkeyCount(final int n){
        int[] num = new int [n];
        for (int i = 0; i < n; i++) {
            num[i] = i+1;
        }
        return num;
    }
}

//    public static int[] monkeyCount(final int n) {
//        return IntStream.rangeClosed(1, n).toArray();
//    }
