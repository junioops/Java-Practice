package HW2;
import java.util.Scanner;
public class Resistance {
    public static double series(double r1, double r2) {
        return r1 * r2;
    }
    public static double parallel(double r1, double r2) {
        return (r1 * r2) / (r1 + r2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose your computation - ");
        System.out.println("1) Series Connection");
        System.out.println("2) Parallel Connection");
        int flag = in.nextInt();

        switch(flag) {
            case 1:
                double r1, r2;
                System.out.println("r1 = ");
                r1 = in.nextInt();
                System.out.println("r2 = ");
                r2 = in.nextInt();

                System.out.println("Your resistance is " + series(r1, r2));
                break;
            case 2:
                double r3, r4;
                System.out.println("r1 = ");
                r3 = in.nextInt();
                System.out.println("r2 = ");
                r4 = in.nextInt();

                System.out.println("Your resistance is " + parallel(r3, r4));
                break;
            default:
                System.out.println("ERROR: Wrong Input.");
        }
    }
}
