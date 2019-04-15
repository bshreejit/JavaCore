package firstday.examples;

public class TwoDimArray {
	public static void main(String[] args) {
		int[][] TwoDim = new int[4][3];
		// int[4][3] means declaring array with 4 rows and columns

		// TwoDim[2][1]=8;

		// Using nested loop
		int temp = 10; 
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				TwoDim[i][j] = temp;
				temp += 10;
			} 

		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(TwoDim[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
