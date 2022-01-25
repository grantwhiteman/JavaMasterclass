package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    double doubleOne = 20.00;
	    double doubleTwo = 80.00;

        double newVal = (doubleOne + doubleTwo) * 100;

        double remainder = newVal % 40;

        boolean divisibleByForty = (remainder == 0);

        System.out.println(divisibleByForty);

        if (!divisibleByForty) System.out.println("Got some remainder");
    }
}
