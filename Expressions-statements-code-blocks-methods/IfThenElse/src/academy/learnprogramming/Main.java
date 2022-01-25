package academy.learnprogramming;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        if (true) {
            System.out.println("hi"); //this is valid
        }
        if (false) {
            System.out.println("This won't print");
        } else if (false) {
            System.out.println("This also won't print");
        } else {
            System.out.println("This will tho");
            String newVar = "Not available outside of code block";
        }
//        System.out.println(newVar); // cannot find this variable

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
