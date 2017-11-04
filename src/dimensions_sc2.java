import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class angle_sum {
    int x, y;
    boolean complementary() {
        return ((x + y) == 90);
    }
    boolean supplementary() {
        return ((x + y) == 180);
    }
}
class dimensions_sc2 extends angle_sum{
    dimensions_sc2(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public static void main(String args[]) throws IOException{
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter two integers - ");
        dimensions_sc2 dimensions = new dimensions_sc2(Integer.parseInt(in.readLine()), Integer.parseInt(in.readLine()));

        System.out.println("Do you want to check for [1] COMPLEMENTARY <s or [2] SUPPLEMENTARY <s?");
        switch (Integer.parseInt(in.readLine())) {
            case 1: System.out.print(dimensions.complementary() ? "They are complemetary." : "They are not complementary");
                break;
            case 2: System.out.print(dimensions.supplementary() ? "They are supplementary." : "They are not supplementary");
                break;
            default:
                System.err.println("ERROR: Incorrect option.");
        }

    }
}