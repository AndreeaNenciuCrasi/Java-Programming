package com.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int num = sortDesc(123456789);
        System.out.println(num);
        int[] arr1 = {2, 20, 200, 2000} ;
        int[] arr2 = {3, 30, 300, 3000};

        System.out.println(IntStream.of(arr1).sum() + IntStream.of(arr2).sum());
    }

    public static int sortDesc(final int num) {
        String[] nums = String.valueOf(num).split("");
        Arrays.sort(nums, Comparator.reverseOrder());
        return Integer.parseInt(String.join("", nums));
    }
}
