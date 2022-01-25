public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(false, 5));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        return (barking && (hourOfDay == 23 || (hourOfDay < 8 && hourOfDay >= 0)));
    }
}
