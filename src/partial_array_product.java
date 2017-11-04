import java.util.*;
class partial_array_product {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of your array : ");
        int k = in.nextInt(), arr[] = new int[k], product = 1;

        System.out.println("Please enter elements of the array : ");
        for(int i  = 0; i < arr.length; i++) arr[i] = in.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++)
                if (arr[j] != arr[i]) product *= arr[j];
            System.out.println("The product excluding " + arr[i]
                + " is " + product);
            product = 1;
        }

    }
}