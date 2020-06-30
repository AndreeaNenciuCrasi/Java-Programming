package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    public static String reverseWords(String str){
        String[] str2 = str.split(" ");
        String fin = "";
        for(int i=str2.length-1;i>=0;i--){
            fin += str2[i];
            if(i>0)fin+=" ";
        }
        return fin;
    }
}

//import java.util.*;
//
//public class ReverseWords {
//
//    public static String reverseWords(String str) {
//        List<String> words = Arrays.asList(str.split(" "));
//        Collections.reverse(words);
//        return String.join(" ", words);
//    }
}
