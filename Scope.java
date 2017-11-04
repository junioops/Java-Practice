class Scope {
	public static void main(String args[]) {
		int x; // know to all code within main
		
		x = 10;
		if(x == 10) { // start the new scope
			int y = 20; // known to only this block
			
			// x and y both are known here.
			System.out.println("x and y: " + x + " " + y);
			x = y * 2;
		}
		// y = 100; // Error! y is not known here
		
		// x is still known here
		System.out.println("x is " + x);
	}
}