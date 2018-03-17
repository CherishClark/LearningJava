package com.cherishclark;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% =" + calculateInterest(10000, 2));
        for(int i=1; i<9; i++) {
          double  amount = calculateInterest(10000, i);
            System.out.println(amount);
        }

        for(int i = 1; i < 20; i++) {
            int counter = 0;
            if (isPrime(i)) {
                counter++;
                System.out.println("number " + i + " is prime");
                if(counter == 3) {
                    System.out.println("exiting");
                }
            }
        }
    }

    public static double calculateInterest( double amount, double interestRate) {
        return(amount * interestRate/100);
    }

    public static boolean isPrime(int n){
        if(n == 1) {
            return false;
        }

        for(int i=2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
