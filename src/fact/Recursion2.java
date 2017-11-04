package fact;
class RecTest {
    int values[];
    RecTest(int i) {
        values = new int[i];
    }
    // display array - recursively
    void printArray(int i) {
        if(i < 0) return;
        else printArray(i - 1);
        System.out.println("[" + i + "]" + " " + values[i]);
    }
}
class Recursion2 {
    public static void main(String args[]) {
        RecTest n = new RecTest(10);
        for(int i = 0; i < 10; i++) n.values[i] = i;
        n.printArray(9);
    }
}