package com.cherishclark;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus   )
         System.out.println("your final score" + highScore);

        if(score == 5000)
            System.out.println("Your score was " + score);

        calculateScore(true, 800, 6, 1000);
        calculateScore(true, 1000, 8, 200);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted + bonus);
            finalScore += 1000;
            return finalScore;
        }
        else {
            return -1;
        }
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " you are on the highscore position" + position);
    }

    public static void calculateHighScorePosition (int score) {
        if(score > 1000){
            System.out.println(">1000");
        } else if(score > 500 && score < 1000 ) {
            System.out.println(">500 < 1000");
        } else if (score > 100 &&  score < 500) {
            System.out.println(">100 < 500");
        } else {
            System.out.println("whatever");
        }
    }
}
