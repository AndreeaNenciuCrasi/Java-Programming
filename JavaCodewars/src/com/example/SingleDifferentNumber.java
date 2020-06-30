package com.example;

//You are given an odd-length array of integers, in which all of them are the same, except for one single number.
//
//        Complete the method which accepts such an array, and returns that single different number.
//
//        The input array will always be valid! (odd-length >= 3)
//
//        Examples
//        [1, 1, 2] ==> 2
//        [17, 17, 3, 17, 17, 17, 17] ==> 3

public class SingleDifferentNumber {
    static int stray(int[] numbers) {
        int number =0;
        for(int i =0; i<numbers.length-1; i++){
            if(numbers[i]== numbers[i+1]){
                number = numbers[i];
                break;
            }
        }
        for(int i=0; i<numbers.length-1; i++){
            if(numbers[i]!=numbers[i+1]){
                if(numbers[i] == number){

                    return numbers[i+1];
                } else{
                    number = numbers[i];
                }
            }
        }
        return number;
    }
}
}

//static int stray(int[] numbers) {
//        Arrays.sort(numbers);
//        return numbers[0] == numbers[1] ? numbers[numbers.length-1] : numbers[0];
//        }