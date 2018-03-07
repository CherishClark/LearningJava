package com.cherishclark;

public class Main {

    public static void main(String[] args) {
        byte myByte = 8;
        short myShort = 2;
        int myInt = 3000;

        long myLong = (long) (50000 + (10*myByte));

        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
    }
}
