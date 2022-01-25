package academy.learnprogramming;

public class Main {
    public static void main(String[] args) { //literally just passing in an array of strings oh my god...
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        calcScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        int highScore = calcScore(gameOver, score, levelCompleted, bonus);
        System.out.println(highScore);

        displayHighScorePosition("Steve", calculateHighScorePosition(1500));
        displayHighScorePosition("Stewie", calculateHighScorePosition(900));
        displayHighScorePosition("Stevie", calculateHighScorePosition(400));
        displayHighScorePosition("James", calculateHighScorePosition(50));
    }

    public static int calcScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1; //these always have to return a value
        //-1 is often returned to indicate an error, and also represents an invalid value or a value not found in searching algorithms
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " was in position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
//        return (score >= 1000) ? 1 : (score >= 500) ? 2 : (score >=  100) ? 3 : 4;
        //or
        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score > 100); {
            position = 3;
        }

        return position;
    }
}
