package com.example;

//Given an array of integers.
//
//        Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.
//
//        If the input array is empty or null, return an empty array.
//
//        Example
//        For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].



public class KataCountPositivesSumNegatives {
    public static int[] countPositivesSumNegatives(int[] input)
    {  int sum = 0;
        int count = 0;
        if ((input == null) || (input.length == 0)){
            int [] arr =new int[0];
            return arr;
        }else{
            for(int i =0; i < input.length; i ++){
                if( input[i]<=0){
                    sum += input[i];
                }else{
                    count += 1;}
            }
        }
        int [] finalArr = new int[2];
        finalArr[0] = count;
        finalArr[1] = sum;
        return finalArr;
    }
}

//    public static int[] countPositivesSumNegatives(int[] input)
//    {
//        if (input == null || input.length == 0) return new int[] {};
//        int count = 0,sum = 0;
//        for (int i : input) {
//            if (i > 0) count ++;
//            if (i < 0) sum += i;
//        }
//        return new int[] {count,sum};
//    }
