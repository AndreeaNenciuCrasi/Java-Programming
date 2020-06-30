package com.example;

//Convert number to reversed array of digits
//        Given a random number:
//
//        C#: long;
//        C++: unsigned long;
//        You have to return the digits of this number within an array in reverse order.
//
//        Example:
//        348597 => [7,9,5,8,4,3]

public class KataDigitize {
    public static int[] digitize(long n) {
        String temp = Long.toString(n);
        int[] numberArray = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            numberArray[i] = temp.charAt(i) - '0';
        }
        int[] finalArr = new int[temp.length()];
        for(int i = numberArray.length-1, j = 0; i >= 0; i--, j++){
            finalArr[j] = numberArray[i]
            ;}
        return finalArr;
    }
}
