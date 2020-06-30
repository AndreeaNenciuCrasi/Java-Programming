package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String myString = "Let's split this up into an array";
                String[] parts = myString.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };

        Runnable runnable1 = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

        Function<String, String> lambdaFunction = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

        System.out.println(lambdaFunction.apply("1234567890"));
        String result = everySecondChar(lambdaFunction, "1234567890");
        System.out.println(result);

//        Supplier<String> iLoveJava = () -> "I love Java!";
        Supplier<String> iLoveJava = () ->{
            return "I love Java";
        };
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);

        List<String> topNames = Arrays.asList(
                "Amelia", "Olivia", "emily", "Isla", "Ava", "oliver", "Jack", "Charlie", "harry", "Jacob"
        );

//        List<String> firstUpperCaseList = new ArrayList<>();
//        topNames.forEach(name ->
//                firstUpperCaseList.add(name.substring(0,1).toUpperCase()+ name.substring(1)));
//        firstUpperCaseList.sort((s1, s2)-> s1.compareTo(s2));
//        firstUpperCaseList.forEach(s -> System.out.println(s));
//        firstUpperCaseList.sort(String::compareTo);
//        firstUpperCaseList.forEach(System.out::println);

        topNames.stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .sorted(String::compareTo)
                .forEach(System.out::println);

        long namesBeginningWithA = topNames
                .stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .filter(name -> name.startsWith("A"))
                .count();
        System.out.println("The number of names beginning with \"A\": " + namesBeginningWithA);

        topNames.stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .forEach(System.out::println);

    }

    public static String everySecondChar(Function<String,String> func, String source) {
        return func.apply(source);
    }
}
