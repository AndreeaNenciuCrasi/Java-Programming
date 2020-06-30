package com.example;

//The first century spans from the year 1 up to and including the year 100, The second - from the year 101 up to and including the year 200, etc.
//
//        Task :
//        Given a year, return the century it is in.
//
//        Input , Output Examples ::
//        centuryFromYear(1705)  returns (18)
//        centuryFromYear(1900)  returns (19)
//        centuryFromYear(1601)  returns (17)
//        centuryFromYear(2000)  returns (20)

public class Century {
    public static void main(String[] args) {
        int century1 = century(1200);
        System.out.println(century1);
        int century2 = century(1450);
        int century3 = century(1769);
        int century4 = century(567);
        System.out.println(century2);
        System.out.println(century3);
        System.out.println(century4);

    }
    public static int century(int number) {
        return (number + 99) / 100;
    }
}
