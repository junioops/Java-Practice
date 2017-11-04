package box5;
class Box {
    double width;
    double height;
    double depth;
    // compute volume
    double volume() {
        return width * height * depth;
    }
    // sets the dimensions of the box
    void setDim(double Width, double Height, double Depth){
        width = Width;
        height = Height;
        depth = Depth;
    }
}
class BoxDemo5 {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        // get the volume of the first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);
        // get the volume of the second box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}