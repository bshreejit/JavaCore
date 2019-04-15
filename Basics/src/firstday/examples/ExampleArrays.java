package firstday.examples;

public class ExampleArrays {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 6, 1 };
		
		/*//Normal Practice
		for (int i = 0; i <= 2; i++) {
			System.out.println(a[i]);
		} */

		// OR Enhanced for statement
		for(int temp:a) {
			System.out.println(temp);
		} 
		
		System.out.println("-------------");
		
		//Declaring and array with its size specified
		int[] x= new int[5]; 
		x[2]=8;
		x[0]=4;
		for(int temp1:x) {
			System.out.println(temp1);
		}
		
		System.out.println("-------------");
		
		//String arrays
		String[] str= {"one","two","three"};
		for(String temp2:str)
		{
			System.out.println(temp2);
		}
		
	}
}
