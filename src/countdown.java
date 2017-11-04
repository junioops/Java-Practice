public class countdown {
    /**
     * The count method recursively reduces n by 1 until it reaches 0, and the message
     * is printed. If n is not 0, it is printed without any message.
     * @param n -> the limit from which the menthod starts
     */
    static void count(int n) {
        if(n == 0) {
            System.out.println(n + "... and BLASTOFF!");
        } else {
            System.out.println(n);
            count(n - 1);
        }
    }
    public static void nLines(int n) {
        if(n > 0) {
            System.out.println();
            nLines(n - 1);
        }
    }
    // occurs because the value at the bottom of the stack is printed first
    public static void displayBinary(int n) {
        if(n > 0) {
            displayBinary(n / 2);
            System.out.print(n % 2);
        }
    }
    public static void main(String[] args) {
        nLines(50);
        count(10);
        displayBinary(23);
    }
}
