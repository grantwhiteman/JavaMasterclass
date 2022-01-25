package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int myValue = 10; // creates a variable of type int with a value of 1000

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer min val = " + myMinIntValue);
        System.out.println("Integer max val = " + myMaxIntValue);
        System.out.println("Busted max = " + (myMaxIntValue + 1));

        int myMaxIntTest = 2_147_483_647; //cannot write 2147483648

        byte myMinByteValue = Byte.MIN_VALUE; //11111111
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte min val = " + myMinByteValue);
        System.out.println("Byte max val = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE; //11111111
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short min val = " + myMinShortValue);
        System.out.println("Short max val = " + myMaxShortValue);

        long myLongValueFromInt = 1000000; //this works because long is longer than int
        long myLongValue = 10000000000L; //without the L, this won't work
        long myMinLongValue = Long.MIN_VALUE; //11111111
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long min val = " + myMinLongValue);
        System.out.println("Long max val = " + myMaxLongValue);

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShort = (short) (myMaxShortValue / 2);
        short myNewByte = (byte) (myMaxByteValue + myMinByteValue);

        byte challengeByte = 25;
        short challengeShort = -500;
        int challengeInt = 63_690;
        long challengeLong = (long) (50_000 + 10 * (challengeByte + challengeShort + challengeInt));

    }
}
