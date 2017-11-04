class PrimeList {
    public static void main(String args[]) {
        int counter = 0, i = 1;
        while(counter != 10_001) {
            int factors = 0;
            for (int x = 1; x <= i; x++)
                if ((i % x) == 0) ++factors;
            if (factors == 2) {
                System.out.println(i);
                ++counter;
            }
            ++i;
        }
    }
}