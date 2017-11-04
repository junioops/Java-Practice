package Pythagoras;
class pythagorean_triplets {
    public static void main(String args[]) {
        int i;
        for(i = 1; i < 1001; i++)
            for(int j = 1; j < 1001; j++)
                for(int c = 1000; c > 0; c--)
                    if ((i * i) + (j * j) == (c * c) & (i + j + c) == 1000)
                        System.out.println(i * j * c);
    }
}