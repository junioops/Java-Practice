import java.util.*;
public class prime_factorization {
    public static void main(String args[]) {
        primeList_retG(1024);
    }
    static boolean isPrime(int x) { // returns true if x is a prime
        for (int y = 2; y < x; y++)
            if (x % y == 0) return !(x % y == 0);
        return true;
    }
    static void primeList_retG(int x) {
        // first take out the prime-factors upto 1/2 x
        ArrayList<Integer> list = new ArrayList<>(), number = new ArrayList<>();
        for (int i = 2, j = x, count = 0; i <= x; i++) {
            if (isPrime(i) & x % i == 0) {
                list.add(i);
                while(j % i == 0) {
                    ++count;
                    j /= i;
                }
                number.add(count);
            }
        }
        int greatest = 0;
        for(int i = 0; i < list.size(); i++)
            if(number.get(i) > greatest) greatest = number.get(i);
        System.out.println(greatest);
    }
}
