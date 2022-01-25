package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        byte validByte = 15;
        short validShort = -4567;
        int validInt = 8999;

        long validLong = (50_000 + 10 * (validInt + validByte + validShort));
        //don't need 'long' because int can be automatically put into longs
        System.out.println(validLong);

        short newShort = (short) (50_000 + 10 *
                (validInt +
                        validByte +
                        validShort));
        System.out.println(newShort + " " + Short.MAX_VALUE);
    }
}
