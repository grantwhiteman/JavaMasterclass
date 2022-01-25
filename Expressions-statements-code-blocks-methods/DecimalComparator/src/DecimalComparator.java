public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.144567, 3.145121));
    }
    public static boolean areEqualByThreeDecimalPlaces(double val1, double val2) {
        return ((long)(val1 * 1000) == (long)(val2*1000));
    }
}
