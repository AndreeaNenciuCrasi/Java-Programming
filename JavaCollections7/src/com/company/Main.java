package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

class Person{
    private int id;
    private String name;
    public Person(int id, String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return id + " : " + name;
    }
}

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        int len1 = o1.length();
        int len2 = o2.length();
        if(len1 > len2){
            return 1;
        }
        if(len1 < len2){
            return -1;
        }
        return 0;
    }
}

class AlphabeticalComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}

class ReverseAlphabeticalComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}

public class Main {

    public static void main(String[] args) {
        ///////////////////////// Sorting Strings /////////////////////
        List<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("elephant");
        animals.add("tiger");
        animals.add("lion");
        animals.add("snake");
        animals.add("mongoose");

        System.out.println("\nSort by length:");
        Collections.sort(animals,
                new StringLengthComparator());

        for (String animal: animals){
            System.out.println(animal);
        }

        System.out.println("\nSort alphabetically:");
        Collections.sort(animals,
                new AlphabeticalComparator());

        for (String animal: animals){
            System.out.println(animal);
        }

        System.out.println("\nReverse sort alphabetically:");
        Collections.sort(animals,
                new ReverseAlphabeticalComparator());

        for (String animal: animals){
            System.out.println(animal);
        }

        ///////////////////////// Sorting Numbers /////////////////////
        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(3);
        numbers.add(36);
        numbers.add(73);
        numbers.add(40);
        numbers.add(1);

        System.out.println("\nSort numbers:");
        Collections.sort(numbers);

        for (Integer number: numbers){
            System.out.println(number);
        }

        System.out.println("\nReverse sort numbers:");
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });

        for (Integer number: numbers){
            System.out.println(number);
        }

        ///////////////////////// Sorting arbitrary objects /////////////////////
        List<Person> people = new ArrayList<Person>();
        people.add(new Person(1, "Joe"));
        people.add(new Person(3, "Bob"));
        people.add(new Person(4, "Clare"));
        people.add(new Person(2, "Sue"));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getId() > o2.getId()){
                    return 1;
                }
                if(o1.getId() < o2.getId()){
                    return -1;
                }
                return 0;
            }
        });
        System.out.println("\nSort people by id:");
        for(Person person: people){
            System.out.println(person);
        }

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("\nSort people by name:");
        for(Person person: people){
            System.out.println(person);
        }

    }
}
