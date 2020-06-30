package com.company;

public class Main {

    public static void main(String[] args) {

//        System.out.println("10,000 at 3% interest = " + calculateInterest(10000, 3D));
//        System.out.println("10,000 at 4% interest = " + calculateInterest(10000, 4D));
//        System.out.println("10,000 at 5% interest = " + calculateInterest(10000, 5D));

        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }
        System.out.println();
        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }
        int count = 0;
        for(int i =10; i< 50; i++){
            if(isPrime(i)){
                count++;
                System.out.println("Number " + i + " " + " is prime");
                if (count == 10){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for(int i=2; i <= n/2; i++ ){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
