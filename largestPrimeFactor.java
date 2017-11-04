class largestPrimeFactor {
	public static void main(String args[]) {
		/* A simple program to find out the largest Prime Factor of  a number
			1. Take out all the factors of the number
			2. Store in an array all those which are prime
		*/
		double targ_no = 600851475143.0, number = 1; // the target number
		// take out all the (prime) factors
		for(double x = 1; x < targ_no; x++)
			if(targ_no % x == 0) { // check if x is prime or not
				int factors = 0;
				for(double y = 1; y <= x; y++)
					if(x % y == 0) ++factors;
				if(factors == 2) {
					number = x;
					System.out.println("Generated - " + number);
				}
			}
		System.out.println(number);
	}
}