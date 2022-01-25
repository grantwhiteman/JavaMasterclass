public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(51);
        printConversion(-5);
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) return -1;
        return Math.round((kilometersPerHour) / 1.609);
    }
    public static void printConversion(double kilometersPerHour) {
        String output;
        long conversion = toMilesPerHour(kilometersPerHour);
        if (conversion == -1) {
            output = "Invalid value";
        } else {
            output = (Math.round(kilometersPerHour) + " km/h = " + conversion + " mi/h");
        }
        System.out.println(output);
    }
}
