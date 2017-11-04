package HW2;
import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        final double CEL_CONST = 9.0 / 5.0, ADD_CONST = 32.0;
        double celsius = 0.0, fahrenheit = 0.0;
        Scanner in = new Scanner(System.in);

        System.out.print("Exactly, what is the celsius value?\n-> ");
        celsius = in.nextInt();

        fahrenheit = (celsius * CEL_CONST) + ADD_CONST;
        System.out.printf("%.1f C = %.1f F",
                celsius, fahrenheit);
    }
}
