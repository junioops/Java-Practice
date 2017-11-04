import java.util.Scanner;
public class TimeConv {
    public static void main(String args[]) {
        double iseconds = 0.0, minutes = 0.0, hours = 0.0, seconds = 0.0;
        Scanner in = new Scanner(System.in);

        System.out.print("Exactly, how many seconds?\n-> ");

        iseconds = in.nextDouble();
        hours = iseconds / 3600;
        seconds = iseconds % 60;
        minutes = (iseconds - (Math.floor(hours) * 3600) - seconds) / 60;

        System.out.println(iseconds + "s = " + (int) hours + "hr, " +
                (int) minutes + "min and " + (int) seconds + "s");
    }
}