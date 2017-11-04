import java.io.*;
class luhn_identification_formula {
    public static void main(String args[]) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.print("Enter your number: ");
        String n = in.readLine();
        int arr[] = new int[n.length()], sum = 0;
        for(int x = 0; x < n.length(); x++) {
            arr[x] = int_conv(n.charAt(x));
            if((x + 1) % 2 == 0) arr[x] *= 2;
            sum += arr[x];
        }
        if(sum % 10 == 0) System.out.println("Valid Luhn number.");
        else System.out.println("Invalid Luhn number.");
    }
    static int int_conv(char x) {
        int y = 0;
        switch (x) {
            case '1': y = 1;
                break;
            case '2': y = 2;
                break;
            case '3': y = 3;
                break;
            case '4': y = 4;
                break;
            case '5': y = 5;
                break;
            case '6': y = 6;
                break;
            case '7': y = 7;
                break;
            case '8': y = 8;
                break;
            case '9': y = 9;
                break;
        }
        return y;
    }
}
