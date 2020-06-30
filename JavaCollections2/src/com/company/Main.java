package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        ArrayList manage arrays internally
//        [0][1][2][3][4][5]...

	    List <Integer> arrayList = new ArrayList <Integer>();

//	    LinkedList consists of elements where each elements
//      has a reference to the previous and the next element
//      [0]->[1]->[2]->[3]->...
//          <-  <-   <-   <- ...

	    List <Integer> linkedList = new LinkedList <Integer>();
        doTimings("ArrayList", arrayList);
        doTimings("LinkedList", linkedList);
    }
    public static void doTimings(String type, List<Integer> list){
        for (int i = 0; i < 1E5; i++){
            list.add(i);
        }
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1E5; i++){
            list.add(0,i);
        }

        long end = System.currentTimeMillis();
        System.out.println("Time taken " + (end - start) + " ms for " + type);
    }
}
