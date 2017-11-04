package fact.inner;
class Outer {
    int outer_x = 100;
    void test() {
        Inner inner = new Inner();
        inner.display();
    }
    class Inner {
        void display() {
            System.out.println("outer_x = " + outer_x);
        }
    }
}
class inner_outer {
    public static void main(String args[]) {
        Outer x = new Outer();
        x.test();
    }
}
