package box3;
class Box {
    double width;
    double height;
    double depth;
    // display volume
    void Volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }
}
class BoxDemo3 {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        // assign values to mybox 1's instance variables
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // assign values to mybox 2's instance variables
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // display the volume of the first box
        mybox1.Volume();
        // display the volume of the second box
        mybox2.Volume();
    }
}