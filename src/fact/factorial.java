package fact;
class Recursion {
    int fact(int n) {
        if(n == 1) return 1; // end function execution
        return fact(n - 1) * n;
    }
}
class factorial {
    public static void main(String args[]) {
        Recursion n = new Recursion();
        System.out.println(n.fact(5));
    }
}