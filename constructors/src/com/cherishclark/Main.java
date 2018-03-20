package com.cherishclark;

import javax.security.auth.login.AccountException;

public class Main {

    public static void main(String[] args) {
//        BankAccount bobsAccount = new BankAccount();
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdrawal(10);
//
//        BankAccount tim = new BankAccount("Tim", "email", 12345);
//        System.out.println(tim.getAccountNumber() + tim.getCustomerName());

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("bobby", 25000);
        System.out.println(person2.getName());


    }
}
