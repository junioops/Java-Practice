package smallest_multiple;
class Multiple {
    int limit;
    // construct a class with a number parameter
    Multiple(int LIMIT) {
        this.limit = LIMIT;
    }
    int number() {
        int i, no;
        for(i = limit, no = 1; i > 0; i--) {
            if((no % i) != 0) {
                i = limit;
                ++no;
                continue;
            }
        }
        return no;
    }
}
class SmallestMultiple {
    public static void main(String args[]) {
        Multiple x = new Multiple(20);
        System.out.println(x.number());
    }
}
