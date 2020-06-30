package com.company;

import java.util.*;

public class Main {
    public static String[] vehicles = {
            "ambulance", "helicopter", "lifeboat"
    };

    public static String[][] drivers = {
            {"Fred", "Sue", "Pete"},
            {"Sue", "Richard", "Bob", "Fred"},
            {"Pete", "Mary", "Bob"}
    };

    public static void main(String[] args) {
        Map<String, Set<String>> personnel = new HashMap<String, Set<String>>();
        for(int i = 0; i < vehicles.length; i++){
            String vehicle = vehicles[i];
            System.out.println(vehicles[i]);
            String [] driversList = drivers[i];

            Set<String> driverSet = new LinkedHashSet<String>();
            for(String driver: driversList) {
                System.out.println(driver);
                driverSet.add(driver);
            }
            personnel.put(vehicle, driverSet);

        }
        for (Map.Entry<String, Set<String>> entry : personnel.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }

        System.out.println();
        {
            Set<String> driversList = personnel.get("helicopter");
            for (String driver : driversList) {
                System.out.println(driver);
            }
        }

        for (String vehicle : personnel.keySet()){
            System.out.print(vehicle);
            System.out.print(": ");
            Set <String> driversList = personnel.get(vehicle);

            for (String driver: driversList){
                System.out.print(driver);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
