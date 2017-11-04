public class Factorial {
    public static int factorial(int n) {
        if(n == 1) {
            return 1;
        }
        int result = factorial(n - 1);
        int ans = n * result;
        return ans;
    }
    public static void main(String[] args) {
        int ans = 1;
        System.out.println(factorial(12));
    }
}