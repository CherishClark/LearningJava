package com.cherishclark;

public class Main {

    public static void main(String[] args) {
	   int newScore =  calculateScore("Tim", 500);
        System.out.println("new score is " + newScore);
        calculateScore(75);
        calculateScore();

        calcFeetAndInchesToCentimeters(1, 6);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + "scored " + score + " points ");
        return score + 1000;
    }

    public static int calculateScore(int score){
        System.out.println("UnnamedPlayer " + "scored " + score + " points ");
        return score + 1000;
    }
    public static int calculateScore(){
        System.out.println(" No Player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet <= 0) || ((inches <0) && (inches >12))) {
            return -1;
        }
        double feetToInches = feet * 12;

        double centimeters = (feetToInches + inches)*2.54;
        System.out.println(centimeters);
        return centimeters;


    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {

        }
    }

}
