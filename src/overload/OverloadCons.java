package overload;
class Box {
    double width, height, depth;

    // constructor when all dimensions are specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor when no dimensions are specified
    Box() {
        width = height = depth = -1;
    }

    // constructor when cube is created
    Box(double len) {
        width = height = depth = len;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}
class OverloadCons {
    public static void main(String args[]) {
        // create boxes using the various constructors
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        // get the volume of the first box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        // get the volume of the second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);

        // get the volume of the third box
        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);
    }
}