package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap <Integer, String> hashMap = new HashMap<Integer, String>();
        LinkedHashMap <Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        TreeMap <Integer, String> treeMap = new TreeMap<Integer, String>();

        System.out.println("\nHashMap - no order");
        testMap(hashMap);

        System.out.println("\nLinkedHashMap - natural order");
        testMap(linkedHashMap);

        System.out.println("\nTreeMap - key order");
        testMap(treeMap);

    }

    public static void testMap(Map <Integer, String> map){
        map.put(9, "fox");
        map.put(4, "cat");
        map.put(8, "dog");
        map.put(1, "giraffe");
        map.put(0, "swan");
        map.put(15, "bear");
        map.put(6, "snake");

        for (Integer key: map.keySet()){
            String value = map.get(key);
            System.out.println(key + " : " + value);
        }
    }
}
