class Squares {
	public static void main(String args[]) {
		for(int x = 3; x <= 10; x++) {
			int arr[][] = new int[x + 1][x + 1];
			for(int y = 3; y <= x; y++)
				for(int z = 0; z <= y; z++)
					arr[y][z] = z;
			for(int i = 0; i <= x; i++) {
				for(int e = 0; e <= i; e++)
					System.out.print(arr[i][e] + " ");
				System.out.println();
			}		
		}
	}
}