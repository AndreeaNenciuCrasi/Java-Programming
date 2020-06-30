package com.example;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Take 2 strings s1 and s2 including only letters from ato z. Return a new sorted string, the longest possible, containing distinct letters,
//
//        each taken only once - coming from s1 or s2.
//        Examples:
//        a = "xyaabbbccccdefww"
//        b = "xxxxyyyyabklmopq"
//        longest(a, b) -> "abcdefklmopqwxy"
//
//        a = "abcdefghijklmnopqrstuvwxyz"
//        longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"

public class TwoToOne {

    public static String longest (String s1, String s2) {
        return IntStream.concat(s1.chars(), s2.chars()).distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}


//import java.util.stream.*;
//
//public class TwoToOne {
//
//    public static String longest (String s1, String s2) {
//        return Stream.of(s1.concat(s2).split(""))
//                .sorted()
//                .distinct()
//                .collect(Collectors.joining());
//    }
//}