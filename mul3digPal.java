class mul3digPal {
	int a_val, b_val;
	void palindrome(int x) {
		// obtain the array of integers
		int a = x / 100_000, b = (x / 10_000) - (a * 10), c = (x / 1_000) - ((a * 100) + (b * 10)), 
			d = (x / 100) - ((a * 1000) + (b * 100) + (c * 10)), e = (x / 10) - ((a * 10_000) + (b * 1000) + (c * 100) + (d * 10)), 
			f = (x) - ((a * 100_000) + (b * 10_000) + (c * 1000) + (d * 100) + (e * 10)), list[] = {a, b, c, d, e, f};
		if((a == f) & (b == e) & (c == d))
			System.out.println(x);
	}
	public static void main(String args[]) {
		mul3digPal n = new mul3digPal();
		for(n.a_val = 999; n.a_val > 99; n.a_val--) { // when both are incremented
			for(n.b_val = 930; n.b_val > 900; n.b_val--) {
				n.palindrome(n.a_val * n.b_val);
			}
		}
	}
}