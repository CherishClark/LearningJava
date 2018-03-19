package com.cherishclark;

public class Main {

    public static void main(String[] args) {
	    int count = 1;
	    while(count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }
        for(int i=6; i!=6; i++){
            System.out.println("count value is " + count);
        }

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while(count !=6);

        int number = 4;
        int finishNumber = 20;;
        int counter = 0;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)){
                if(counter == 5){
                    break;
                }
                counter++;
                continue;
            }
            System.out.println("even number " + number);
        }



    }

    public static boolean isEvenNumber (int numba) {
        if (numba % 2 == 0) {
            System.out.println(numba + "is even");
            numba++;
            return true;
        } else {
        System.out.println(numba + " false");
        return false;
    }
    }

}

