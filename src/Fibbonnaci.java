public class Fibbonnaci {
    public static void series(int n1, int n2, int end) {
        if(end != 0) {
            int result = n1 + n2;
            n1 = n2;
            n2 = result;
            System.out.println(result);
            series(n1, n2, end - 1);
        } else {
            return;
        }
    }
    public static void main(String[] args) {
        series(0, 1, 10);
    }
}
