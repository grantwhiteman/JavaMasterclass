package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 =" + result);
        int prevResult = result;
        System.out.println("Prev result = " + prevResult);
        result -= 1;
        System.out.println("3 - 1 = " + result);

        result *= 10; // 2 x 10 = 20
        System.out.println("2 * 10 = " + result);

        result /= 5; // 20 / 5 = 4;
        System.out.println("20 / 5 = " + result);

        result %= 3; // 4 % 3 = 1;
        System.out.println("4 % 3 = " + result);

        // result++
        // result--
        // result += 3 etc. as above

        boolean isAlien = false;
        if (isAlien == false) // this will end wherever the ';' goes
            System.out.println("It is not an alien");
        isAlien = !isAlien;
        if (isAlien) {
            System.out.println("It is an alien");
            System.out.println("And I'm scared of aliens");
        }

        int topScore = 80;
        if (topScore != 100) System.out.println("You didn't get the top score");
        if (topScore <= 100) System.out.println("You didn't get the top score");

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }


        boolean wasCar = isCar ? true : false;

        int ageOfClient = 20;
        boolean isOverEighteen = (ageOfClient >= 18) ? true : false;
    }
}
