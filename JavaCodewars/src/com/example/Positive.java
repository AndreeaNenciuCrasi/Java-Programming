package com.example;

//You get an array of numbers, return the sum of all of the positives ones.
//
//        Example [1,-4,7,12] => 1 + 7 + 12 = 20
//
//        Note: if there is nothing to sum, the sum is default to 0.

import java.util.stream.IntStream;

public class Positive {

    public static int sum(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            if (element > 0) {
                sum += element;
            }
        }
        if (sum > 0) {
            return sum;
        }
        return 0;
    }
}

//    public static int sum(int[] arr) {
//        return IntStream.of(arr).filter(x -> x > 0).sum();
//    }