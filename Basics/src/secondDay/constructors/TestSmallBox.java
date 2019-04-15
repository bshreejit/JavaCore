package secondDay.constructors;

import java.util.Scanner;

public class TestSmallBox {

	public static void main(String[] args) {
		
		//Taking Input From Keyboard
		System.out.println("Enter first value : ");
		Scanner sc1=new Scanner(System.in);
		int k=sc1.nextInt();
		
		System.out.println("Enter second value : ");
		Scanner sc2=new Scanner(System.in);
		int r=sc2.nextInt();
		
		if(k==r) {
		SmallBox B = new SmallBox();
		// Constructor is called As soon as Object is created
		int p = B.Area();
		System.out.println("Result = " + p);
		}
		else {
		SmallBox C = new SmallBox(2,6);
		int q=C.Area();
		System.out.println("Q = "+q);}
	}

}
