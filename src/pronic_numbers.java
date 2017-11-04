import java.util.Scanner;
class pronic_numbers {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int begin, end;

        System.out.print("Enter the beginning point of the loop: ");
        begin = in.nextInt(); // store the beginning of the loop
        System.out.print("Enter the end point of the loop: ");
        end = in.nextInt(); // store the last point of the loop construct

        for(int i = begin; i <= end; i++)
            for(int j = 1; j <= i / 2; j++)
                System.out.print( (j * (j + 1)) == i ? i + " is a pronic number.\n" : "");
    }
}