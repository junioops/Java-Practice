import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        // the scanner sets up an interferance for input of variables
        Scanner in = new Scanner("abc"); // -> The Scanner class returns the current argument's result
        String xyz = in.nextLine();
        System.out.println(System.in);
    }
}
