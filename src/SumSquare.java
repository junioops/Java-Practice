// evaluate the difference between sum of squares and square sum
class SumSquare {
    public static void main(String args[]) {
        // evaluate the square sum of 1 -> 10
        int sum = 0, ans = 0;
        for(int i = 1; i < 101; i++)
            sum += i;
        sum *= sum;

        ans = sum;
        sum = 0;

        // evaluate the sum of squares of 1 -> 10
        for(int i = 1; i < 101; i++)
            sum += (i * i);
        ans -= sum;

        System.out.println("Ans: " + ans);
    }
}