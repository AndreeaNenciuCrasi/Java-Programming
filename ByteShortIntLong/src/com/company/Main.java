package com.company;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;
	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Maximum Value = " + (myMaxIntValue + 1));
        System.out.println("Busted Minimum Value = " + (myMinIntValue - 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);


        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        int myTotal = (myMaxIntValue / 2);
        byte myNewByteValue = (byte)(myMaxByteValue / 2);
        short myNewShortValue = (short)(myMaxShortValue / 2);
        System.out.println(myTotal);
        System.out.println(myNewByteValue);
        System.out.println(myNewShortValue);

        byte myByteChallengeValue = 10;
        short myShortChallengeValue = 20;
        int myIntChallengeValue = 50;
        long myTotalValue = 50000L + 10L*(myByteChallengeValue + myShortChallengeValue + myIntChallengeValue);
        System.out.println("Total Long Value = " + myTotalValue);

        short myShortTotal = (short)(1000 + 10 * (myByteChallengeValue + myShortChallengeValue + myIntChallengeValue));
        System.out.println("Total Short Value = " + myShortTotal);
    }
}
