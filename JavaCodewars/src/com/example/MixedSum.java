package com.example;

import java.util.List;

//Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
//
//        Return your answer as a number.


public class MixedSum {

    /*
     * Assume input will be only of Integer o String type
     */
    public int sum(List<?> mixed) {
        int sum = 0;

        for (Object element : mixed)
        {
            if (element instanceof Integer)
            {
                sum += (Integer) element;
            }
            else if (element instanceof String){
                sum += Integer.parseInt( (String) element );
            }
        }
        return sum;
    }
}

//    public int sum(List<?> mixed) {
//
//        int x = 0;
//        for(Object s: mixed){
//            x+=Integer.parseInt(s.toString());
//        }
//
//        return x;
//    }