package box6;
class Box {
    double width;
    double height;
    double depth;
    // compute volume
    double volume() {
        return width * height * depth;
    }
    // sets the dimensions of the box
    Box(){
        System.out.println("Constructing Box.");
        width = 10;
        height = 20;
        depth = 15;
    }
}
class BoxDemo6 {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume is " + vol);
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}