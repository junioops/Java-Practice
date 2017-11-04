class A {
    int i, j;
    void showij() {
        System.out.println("i + j = " + i + " " + j);
    }
}
class B extends A {
    int k;
    void sum() {
        System.out.println(i + j + k);
    }
}
class SimpleInheritance {
    public static void main(String args[]) {
        A superOb = new A();
        B subOb = new B();

        subOb.i = 10;
        subOb.j = 20;
        subOb.k = 15;

        subOb.sum();
    }
}