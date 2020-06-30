package com.example;

//I'm new to coding and now I want to get the sum of two arrays...actually the sum of all their elements. I'll appreciate for your help.
//
//        P.S. Each array includes only integer numbers. Output is a number too.

public class Sum {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum = 0;
        int[] arr =new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, arr, 0, arr1.length);
        System.arraycopy(arr2, 0, arr, arr1.length, arr2.length);
        for(int i =0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

}

//import java.util.stream.*;
//
//public class Sum {
//
//    public static int arrayPlusArray(int[] arr1, int[] arr2) {
//        return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
//    }
//
//}