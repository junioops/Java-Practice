class ScopeErr {
	public static void main(String args[]) {
		// you cannot declare a variable with the same name as the outer block
		int bar = 1;
		{ // creates a new scope
			int bar = 2; // compile-time error - bar has already be defined!
		}
	}
}