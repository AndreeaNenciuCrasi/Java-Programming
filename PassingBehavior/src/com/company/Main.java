package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        String prefix = "MR. ";
        System.out.println(process("Hello World!", prefix::concat));
        System.out.println(process("Hello World!", String::toLowerCase));
        System.out.println(process2("Hello World!", 6, (str, i) -> str.substring(i)));

        String[] names ={"Mr. Sanjay", "Ms Trupti", "Dr John", "Ms. Andros", "Mr. Cond"};
        Arrays.sort(names, Comparator.comparing(Main::firstName));
        System.out.println(Arrays.toString(names));

        Arrays.sort(names, Comparator.comparing(Main::firstName).reversed().thenComparing(Main::title)
        );
        System.out.println(Arrays.toString(names));
    }

    public static String title(String name){
        return name.split(" ")[0];
    }

    public static String firstName(String name){
        return name.split(" ")[1];
    }

    private static String process2(String str, int i, BiFunction<String, Integer, String> processor){
        return processor.apply(str, i);
    }

    private static String process(String str, Function<String, String> processor){
        return processor.apply(str);
    }
}


