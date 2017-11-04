class SummationPrimes {
    /*boolean isPrime(int x) { // returns true if x is a prime
        for(int y = 2; y < x; y++)
            if (x % y == 0) return !(x % y == 0);
        return true;
    }*/
    void genList(int limit) {
        int[] arr = new int[limit];
        for(int x = 2; x < limit; x++) {
            if(x == 2 || x == 3 || x == 5 || x == 7) arr[x - 2] = x;
            else if(x % 2 != 0 & x % 3 != 0 & x % 5 != 0 & x % 7 != 0) arr[x - 2] = x;
        }
        for(int i = 2; i < limit + 1; i++)
            for(int j = 0; j < limit; j++)
                if(arr[j] % i == 0 & arr[j] != i) arr[j] = 0;
        for(int i : arr) System.out.print(i != 0 ? i + "\n" : "");
    }
    public static void main(String args[]) {
        SummationPrimes x = new SummationPrimes();
        x.genList(100_000);
    }
}