package com.company;

public class Main {

    public static void main(String[] args) {

//        Account bobsAccount = new Account();
//        "12345", 0.00, "Bob Brown", "myemail@bob.com",
//                "(087) 123-456");
//
//        System.out.println(bobsAccount.getNumber());
//        System.out.println(bobsAccount.getBalance());
//        System.out.println();
//        bobsAccount.withdrawal(100.0);
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdrawal(100.0);
//        bobsAccount.deposit(51.0);
//        bobsAccount.withdrawal(100.0);
//
//        Account timsaccount = new Account("Tim", "tim@email.com", "12345");
//        System.out.println(timsaccount.getNumber() + " name " + timsaccount.getCustomerName());

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 25000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());



    }
}
