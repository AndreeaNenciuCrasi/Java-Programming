package com.example;

//Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most secret question is still correct. However, since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it.
//
//        Your task is to write a function maskify, which changes all but the last four characters into '#'.
//
//        Examples
//        Maskify.Maskify("4556364607935616"); // should return "############5616"
//        Maskify.Maskify("64607935616");      // should return "#######5616"
//        Maskify.Maskify("1");                // should return "1"
//        Maskify.Maskify("");                 // should return ""
//
//// "What was the name of your first pet?"
//        Maskify.Maskify("Skippy");                                   // should return "##ippy"
//        Maskify.Maskify("Nananananananananananananananana Batman!"); // should return "####################################man!"



public class Maskify {
    public static String maskify(String str) {
        int length = str.length();
        if(length <=4){
            return str;}
        String str1 =str.substring(str.length() - 4);
        String str2 = "";
        for(int i =0; i < length-4; i++){
            str2+="#";
        }
        return str2.concat(str1);
    }
}

//    public static String maskify(String str) {
//        char[] strChars = str.toCharArray();
//        for( int i = 0; i < strChars.length - 4; i++ ) {
//            strChars[i] = '#';
//        }
//        return new String(strChars);
//    }


//    public static String maskify(String str) {
//        return str.replaceAll(".(?=.{4})", "#");
//    }