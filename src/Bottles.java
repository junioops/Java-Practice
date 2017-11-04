public class Bottles {
    public static void verseGen(int limit) {
        if(limit > 0) {
            System.out.println(limit + " bottles of sprite on the wall");
            System.out.println(limit + " bottles of sprite");
            System.out.println("ya’ take one down, ya’ pass it around");
            System.out.println(limit + " bottles of sprite on the wall.\n");

            verseGen(limit - 1);
        } else {
            System.out.println("No bottles of sprite on the wall,");
            System.out.println("No bottles of sprite");
            System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
            System.out.println("’cause there are no more bottles of sprite on the wall");
        }
    }
    public static void main(String[] args) {
        verseGen(99);
    }
}