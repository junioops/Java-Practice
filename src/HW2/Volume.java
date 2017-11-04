package HW2;
import java.util.Scanner;
public class Volume {
    public static double volume(double l, double b, double h) {
        double result = l * b * h;
        return result;
    }
    public static double volume(double r, double h) {
        double result = Math.PI * Math.pow(r, 2) * h;
        return result;
    }
    public static void main(String[] args) {
        final double CONE_CONST = 1.0 / 3.0;
        double vol = 0; // store the area
        Scanner in = new Scanner(System.in);

        System.out.println("Choose your computation from the following - ");
        System.out.println("[1] Volume of a cuboid");
        System.out.println("[2] Volume of a cylinder");
        System.out.println("[3] Volume of a cone\n-> ");
        char flag = in.nextLine().charAt(0);

        switch(flag) {
            case '1':
                double l, b, h;
                System.out.println("Please enter the dimensions of your cuboid - ");
                System.out.print("a) length (l) = ");
                l = in.nextDouble();
                System.out.print("a) breadth (b) = ");
                b = in.nextDouble();
                System.out.print("a) height (h) = ");
                h = in.nextDouble();
                vol = volume(l, b, h);

                System.out.printf("The volume of your cuboid is %.2f", vol);
                break;
            case '2':
                double r, h2;
                System.out.println("Please enter the dimensions of your cylinder - ");
                System.out.print("a) radius (r) = ");
                r = in.nextDouble();
                System.out.print("a) height (h) = ");
                h2 = in.nextDouble();
                vol = volume(r, h2);

                System.out.printf("The volume of your cylinder is %.2f", vol);
                break;
            case '3':
                double r2, h3;
                System.out.println("Please enter the dimensions of your cone - ");
                System.out.print("a) radius (r) = ");
                r2 = in.nextDouble();
                System.out.print("a) height (h) = ");
                h3 = in.nextDouble();
                vol = CONE_CONST * volume(r2, h3);

                System.out.printf("The volume of your cone is %.2f", vol);
                break;
            default:
                System.err.println("ERROR: Incorrect Input");
        }
    }
}
