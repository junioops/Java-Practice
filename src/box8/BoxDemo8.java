package box8;
class Box {
    double width, height, depth;
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }
    Box(double len) {
        width = height = depth = len;
    }
    double volume() {
        return width * height * depth;
    }
}
class BoxWeight extends Box {
    double weight;
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); // using the superclass's consructor
        weight = m;
    }
    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }
    BoxWeight() {
        super();
        weight = -1;
    }
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}
class Shipment extends BoxWeight {
    double cost;
    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }
    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }
    Shipment() {
        super();
        cost = -1;
    }
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}
class BoxDemo8 {
    public static void main(String args[]) {
        Shipment ship1 = new Shipment(80.0, 40, 900.0);
        System.out.println(ship1.cost);
    }
}