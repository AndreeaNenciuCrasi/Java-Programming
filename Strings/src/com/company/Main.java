package com.company;

public class Main {

    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println("myString equals to " + myString);
        myString = myString + " , and this is more";
        System.out.println("myString equals to " + myString);
        myString = myString + '\u00A9';
        System.out.println("myString equals to " + myString);
        String numberString = "255.50";
        numberString = numberString + "44.50";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString equals to " + lastString);
        double myDouble = 10.25d;
        lastString = lastString + myDouble;
        System.out.println("lastString equals to " + lastString);

    }
}
