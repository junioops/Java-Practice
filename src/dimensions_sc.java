import java.io.*;
class dimensions_sc {
    public static void main(String args[]) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter the length, followed by breadth of a rectangle - (LENGTH, ENTER, BREADTH)");
        int length = Integer.parseInt(in.readLine()), breadth = Integer.parseInt(in.readLine()), op;
        System.out.print("Enter the option [n] to calculate the following values - \n"
            + "[1] AREA of the rectangle\n"
            + "[2] PERIMETER of the rectangle\n"
            + "[3] DIAGONALS of the rectangle\n-> ");
        op = Integer.parseInt(in.readLine());

        switch (op) {
            case 1 : System.out.println("AREA = " + (length * breadth) + " units square");
                break;
            case 2 : System.out.println("PERIMETER = " + (2 * (length + breadth)) + " units");
                break;
            case 3 : System.out.println("DIAGONAL(S) = " +
                        Math.sqrt(breadth * breadth + length * length) + " units");
                break;
            default : System.err.println("WRONG input.");
        }

    }
}