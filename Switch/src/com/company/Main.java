package com.company;

public class Main {

    public static void main(String[] args) {

        int value = 3;
        if(value == 1){
            System.out.println("Value was 1.");
        }else if (value == 2){
            System.out.println("Value was 2.");
        }else {
            System.out.println("Value was not 1 or 2.");
        }

        int switchValue = 6;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1.");
                break;
            case 2:
                System.out.println("Value was 2.");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3, or 4, or 5.");
                System.out.println("Actually it was a: " + switchValue);
                break;
            default:
                System.out.println("Value was not 1, 2, 3, 4 or 5.");
                break;
        }

        char charValue = 'A';
        switch (charValue){
            case 'A':
                System.out.println("A was found.");
                break;
            case 'B':
                System.out.println("B was found.");
                break;
            case 'C':
                System.out.println("C was found.");
                break;
            case 'D':
                System.out.println("D was found.");
                break;
            case 'E':
                System.out.println("E was found.");
                break;
            default:
                System.out.println("Not found");
                break;
        }
        String month = "januaRY";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
