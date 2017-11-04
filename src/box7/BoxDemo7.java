package box7;
class Box {
    double width;
    double height;
    double depth;
    // compute volume
    double volume() {
        return width * height * depth;
    }
    // this is the constructor for the box
    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}
class BoxDemo7 {
    public static void main(String args[]) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume is " + vol);
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}