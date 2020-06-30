package com.example;
import static java.util.Arrays.stream;

public class KataAverage {

    public static double find_average(int[] array){
        return stream(array).average().getAsDouble();
    }
}

//    public static double find_average(int[] array){
//        int sum=0;
//        for (int i=0;i<array.length;i++) {
//            sum += array[i];
//        }
//        return (double)sum/array.length;
//    }