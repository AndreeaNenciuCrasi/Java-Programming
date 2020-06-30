package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new LinkedHashSet<String>();
        Set<String> set3 = new TreeSet<String>();
        if (set1.isEmpty()) {
            System.out.println("\nSet is empty at start");
        }
        set1.add("dog");
        set1.add("cat");
        set1.add("mouse");
        set1.add("snake");
        set1.add("bear");
        set1.add("mouse");
        set2.add("dog");
        set2.add("cat");
        set2.add("mouse");
        set2.add("snake");
        set2.add("bear");
        set2.add("mouse");
        set3.add("dog");
        set3.add("cat");
        set3.add("mouse");
        set3.add("snake");
        set3.add("bear");
        set3.add("mouse");
        if (set1.isEmpty()) {
            System.out.println("\nSet is not empty at end");
        }
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
        for (String element : set1) {
            System.out.println(element);
        }
        if (set1.contains("aaaaaaa")) {
            System.out.println("Contains aaaaaaa");
        }
        if (set1.contains("cat")) {
            System.out.println("\nContains cat");
        }
        Set<String> set4 = new TreeSet<String>();
        set4.add("dog");
        set4.add("cat");
        set4.add("giraffe");
        set4.add("monkey");
        set4.add("ant");
        Set<String> intersection = new HashSet<String>(set1);
        intersection.retainAll(set4);
        System.out.println("Intersection : " + intersection);
        Set<String> difference = new HashSet<String>(set1);
        difference.removeAll(set4);
        System.out.println("Difference 1 : " + difference);
        Set<String> difference1 = new HashSet<String>(set4);
        difference1.removeAll(set1);
        System.out.println("Difference 2 : " + difference1);
    }
}