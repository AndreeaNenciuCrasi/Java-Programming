package com.company;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> values =Arrays.asList(12, 20, 35, 46, 55, 68, 75);

        int result=0;
        for(int i: values){
            if(i%5==0){
                result+=i;
            }
        }

        System.out.println(result);
        System.out.println(values.stream().filter(i->i%5==0).reduce(0,(c,e)->c+e));
        System.out.println(values.stream().filter(i->i%5==0).map(i->i*2).reduce(0,(c,e)->c+e));

        System.out.println(values.stream()
                            .filter(i->i%5==0)
                            .map(i->i*2)
                            .findFirst()
                            .orElse(0));

        System.out.println(values.stream()
                .filter(Main::isDivisible)
                .map(Main::mapDouble)
                .findFirst()
                .orElse(0));

//        List<Integer> values = Arrays.asList(1,2,3,4,5,6);
//
//        int result=0;
//        for(int i: values){
//            result=result+i*2;
//        }
//        System.out.println(result);
//        System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)->c+e));
//        System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)->Integer.sum(c,e)));
//        System.out.println(values.stream().map(i->i*2).reduce(Integer::sum));

        //        Internal Iteration
//        ------------------------------------------
//        values.forEach(i-> System.out.println(i));

//        values.forEach(System.out::println); //method reference
//        values.forEach(Main::doubleit);

//        External Iteration
//        ----------------------------------------------
//        for(int i= 0; i<6;i++){
//            System.out.println(values.get(i));
//        }


//        Iterator<Integer> i = values.iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }

//        for(int i: values){
//            System.out.println(i);
//        }
    }

    public static boolean isDivisible(int i){
        System.out.println("in isDivisible " +i);
        return i%5==0;
    }

    public static int mapDouble(int i){
        System.out.println("i mapdouble " + i);
        return i*2;
    }

    public static void doubleit(int i){
        System.out.println(i*2);
    }
}
