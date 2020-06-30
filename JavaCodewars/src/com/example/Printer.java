package com.example;

//In a factory a printer prints labels for boxes. For one kind of boxes the printer has to use colors which, for the sake of simplicity, are named with letters from a to m.
//
//        The colors used by the printer are recorded in a control string. For example a "good" control string would be aaabbbbhaijjjm meaning that the printer used three times color a, four times color b, one time color h then one time color a...
//
//        Sometimes there are problems: lack of colors, technical malfunction and a "bad" control string is produced e.g. aaaxbbbbyyhwawiwjjjwwm with letters not from a to m.
//
//        You have to write a function printer_error which given a string will output the error rate of the printer as a string representing a rational whose numerator is the number of errors and the denominator the length of the control string. Don't reduce this fraction to a simpler expression.
//
//        The string has a length greater or equal to one and contains only letters from ato z.
//
//        #Examples:
//
//        s="aaabbbbhaijjjm"
//        error_printer(s) => "0/14"
//
//        s="aaaxbbbbyyhwawiwjjjwwm"
//        error_printer(s) => "8/22"

public class Printer {
    public static String printerError(String str) {
        int errorsCount = 0;
        for(int i=0; i < str.length(); i++){
            if(str.charAt(i)=='n' || str.charAt(i)=='o' || str.charAt(i)=='p'
                    || str.charAt(i)=='q' || str.charAt(i)=='r' || str.charAt(i)=='s'
                    || str.charAt(i)=='t' || str.charAt(i)=='u' || str.charAt(i)=='v'
                    || str.charAt(i)=='w' || str.charAt(i)=='x' || str.charAt(i)=='y'
                    || str.charAt(i)=='z'){
                errorsCount++;}}
        return errorsCount +"/"+str.length();
    }
}

//    public static String printerError(String s) {
//        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
//    }
