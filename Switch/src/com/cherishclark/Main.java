package com.cherishclark;

public class Main {

    public static void main(String[] args) {
//	int value = 1;
//        if (value == 1) {
//            System.out.println("value was 1");
//
//        } else if(value == 2) {
//            System.out.println("value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }
//
//        int switchValue = 22;
//
//        switch(switchValue) {
//            case 1:
//                System.out.println("value was 1");
//                break;
//
//            case 2:
//                System.out.println("value was 2");
//                break;
//            default:
//                System.out.println("was not 1 or 2");
//                break;
//        }
////        more code here
//    }

        char character = 'A';

        switch (character) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("A, B, C, D, or E");
                System.out.println("is actually " + character);
                break;
            default:
                System.out.println("nada");
                break;
        }
    }
}

//}

