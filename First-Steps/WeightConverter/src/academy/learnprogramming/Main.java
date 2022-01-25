package academy.learnprogramming;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System in is a standard input stream
        System.out.println("Weight: ");
        String weightStr = sc.nextLine();
        double weight = Double.parseDouble(weightStr);
        System.out.println("Enter 'lb' or 'kg': ");
        String unit = sc.nextLine();
        if (Objects.equals(unit, "lb")) {
            System.out.println("Your weight is equivalent to " + (float) (weight * 0.45359237) + "kg");
        }
        else if (Objects.equals(unit, "kg")) {
            System.out.println("Your weight is equivalent to " + (float) (weight * (1 / 0.45359237 )) + "lb");
        }
    }
}
