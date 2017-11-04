class VarArgs {
    static void vaTest(int number, String ... v) { // varargs
        System.out.print("#" + number + " ");
        for(String i : v)
            System.out.print(i + " ");
    }
    public static void main(String args[]) {
        vaTest(9, "900000", "234");
    }
}