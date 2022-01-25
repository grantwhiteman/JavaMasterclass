package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        System.out.println("Float min: " + myMinFloat);
        System.out.println("Float max: " + myMaxFloat);

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println("Double min: " + myMinDouble);
        System.out.println("Double max: " + myMaxDouble);

        int myInt = 5 / 3; // this will print 1
        float myFloat = 5f / 3f; // 7 numbers after decimal point

        //need the f or (float) here because otherwise it is assumed to be a double by default
        //use the f over casting, also double is apparently better than float
        double myDouble = 5.00 / 1; // 16 numbers after decimal point, if the value is whole it will show 1dp, else it will show the full number and then no more digits

        System.out.println("My int:" + myInt);
        System.out.println("My float:" + myFloat);
        System.out.println("My double:" + myDouble);
    }
}
