package box1;

class Box {
    double width;
    double height;
    double depth;
}
public class BoxClass {
    public static void main(String args[]) {
        Box mybox = new Box();
        double vol;

        // assign values to mybox's instance variables
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        // compute the volume of the box
        vol = mybox.height * mybox.width * mybox.depth;

        System.out.println("Volume is " + vol);
    }
}
