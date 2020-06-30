package com.example;

//Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
//
//        The output should be two capital letters with a dot separating them.
//
//        It should look like this:
//
//        Sam Harris => S.H
//
//        Patrick Feeney => P.F

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        String[] nameArray = name.split(" ");
        String[] firstName = nameArray[0].split("");
        String[] secondName = nameArray[1].split("");
        return firstName[0].toUpperCase() + "." + secondName[0].toUpperCase();
    }
}

//public class AbbreviateTwoWords {
//
//    public static String abbrevName(String name) {
//        String[] names = name.split(" ");
//        return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
//    }
//}