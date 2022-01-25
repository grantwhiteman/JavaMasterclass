package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        // String is not a primitive type, it is a class but it is treated special
        // String is a sequence of characters only limited by computer memory
        String myString = "This is a string";
        myString = myString + ", and this is more";
        myString = myString + " \u00A9 2019";
        System.out.println("My string: " + myString);

        String numberString = "250.55";
        numberString += "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 20;
        lastString += 10;
        lastString += myInt;
        double number = 120.47d;
        lastString += number;
        System.out.println(lastString);

        //Strings in java are immutable, so instead Java makes a new string and gets rid of the old one
        //This is therefore inefficient and not recommended, instead we might use a StringBuffer
    }
}
