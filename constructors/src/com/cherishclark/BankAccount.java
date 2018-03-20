package com.cherishclark;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;



//    public BankAccount() {
//        this(99999, 100, customerName, email, phoneNumber);
//
//        System.out.println("empty constructor called");
//    }

    public BankAccount(int phoneNumber, double balance, String customerName) {
        this.phoneNumber = phoneNumber;
        this.balance = balance;
        this.customerName = customerName;
    }
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
    }

    public void withdrawal(double withdrawalAmount) {
        if(this.balance - withdrawalAmount < 0) {
            System.out.println("only " + this.balance + "available, withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("withdrawal of " + withdrawalAmount + "processed" + this.balance + "remanining balance");
        }
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
