public class LeapYearCalculator {
    public static void main(String[] args) {

    }

    public static boolean isLeapYear(int year) {
        boolean output = false;

        if (year > 0 && year < 10000) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        output = true;
                    }
                } else output = true;
            }
        }
        return output;
    }
}
