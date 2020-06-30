package com.company;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);
        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);
        numberAsString += 1;
        number += 1;
        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);


        System.out.println();
        String numberAsString1 = "2018.125";
        System.out.println("numberAsString = " + numberAsString1);
        double number1 = Double.parseDouble(numberAsString1);
        System.out.println("number = " + number1);
        numberAsString1 += 1;
        number1 += 1;
        System.out.println("numberAsString = " + numberAsString1);
        System.out.println("number = " + number1);
    }
}
