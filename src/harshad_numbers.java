import java.util.Scanner;

class harshad_numbers {
    public static void main(String args[]) {
        Scanner in  = new Scanner(System.in);

        String x = in.nextLine();
        int sum = 0;

        for(int y : conviStr(x)) sum += y;

        if(origNum(x) % sum == 0) System.out.println(origNum(x) + " is a Harshad number.");
        else System.out.println(origNum(x) + " is not a Harshad number.");
    }
    static int[] conviStr(String x) {
        int[] result = new int[x.length()];
        for(int y = 0; y < x.length(); y++)
            result[y] = x.charAt(y) - 48;
        return result;
    }
    static int origNum(String x) {
        int result = 0;
        for(int y = x.length() - 1, z = 1; y > -1; y--) {
            result += (z * (x.charAt(y) - 48));
            z *= 10;
        }
        return result;
    }
}