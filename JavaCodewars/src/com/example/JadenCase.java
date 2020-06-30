package com.example;

//Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013). Jaden is also known for some of his philosophy that he delivers via Twitter. When writing on Twitter, he is known for almost always capitalizing every word. For simplicity, you'll have to capitalize each word, check out how contractions are expected to be in the example below.
//
//        Your task is to convert strings to how they would be written by Jaden Smith. The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.
//
//        Example:
//
//        Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
//        Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
//        Note that the Java version expects a return value of null for an empty string or null.

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {
    public String toJadenCase(String phrase) {
        if(phrase == null || phrase.equals("")){
            return null;}
        String[] arr = phrase.split(" ");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(0)))
                    .append(arr[i].substring(1)).append(" ");
        }
        return sb.toString().trim();
    }
}

//    public String toJadenCase(String phrase) {
//        if (null == phrase || phrase.length() == 0) {
//            return null;
//        }
//
//        return Arrays.stream(phrase.split(" "))
//                .map(i -> i.substring(0, 1).toUpperCase() + i.substring(1, i.length()))
//                .collect(Collectors.joining(" "));
//    }


//import org.apache.commons.lang3.text.WordUtils;
//    public String toJadenCase(String phrase) {
//        if(phrase == ""){
//            return null;
//        }
//        else{
//            return WordUtils.capitalize(phrase);
//        }
//    }