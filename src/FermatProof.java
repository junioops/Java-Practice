import java.util.Scanner;
public class FermatProof {
    public static void checkFermat(int a, int b, int c, int n) {
        final boolean result = Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n);
        if(n > 2 && result) {
            System.out.println("Holy Smokes! Fermat was wrong!");
        } else {
            System.out.println("No, that doesn\'t work");
        }
    }
    public static void main(String[] args) {
        checkFermat(3, 4, 5, 30);
    }
}