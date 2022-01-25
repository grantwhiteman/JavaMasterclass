public class TeenNumberChecker {
    public static boolean hasTeen(int val1, int val2, int val3) {
        //returns true if values contain a teen number
        return (12 < val1 && val1 < 20) ||
                (12 < val2 && val2 < 20) ||
                (12 < val3 && val3 < 20);

    }
    public static boolean isTeen(int val1) {
        //returns true if value is a teen number
        return (12 < val1 && val1 < 20);
    }
}
