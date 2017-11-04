package HW2;
import java.util.Scanner;
public class SI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double SI = 0, CI = 0;
        double p, r, t;
        System.out.println("Choose your computation - ");
        System.out.println("1) Simple Interest");
        System.out.println("2) Compound Interest\n->");
        int flag = in.nextInt();
        switch(flag) {
            case 1:
                System.out.println("p = ");
                p = in.nextDouble();
                System.out.println("r = ");
                r = in.nextDouble();
                System.out.println("t = ");
                t = in.nextDouble();
                System.out.println("ans = " + (p * r * t / 100.0));
                break;
            case 2:
                System.out.println("p = ");
                p = in.nextDouble();
                System.out.println("r = ");
                r = in.nextDouble();
                System.out.println("t = ");
                t = in.nextDouble();
                System.out.println("ans = " + (p * Math.pow((((r / 100.0) + 1.0)), t))) - p;
                break;
            default:
                System.out.println("ERROR: Incorrect Input.");
        }
    }
}
