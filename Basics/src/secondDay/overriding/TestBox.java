package secondDay.overriding;

import secondDay.inheritance.Box;
import secondDay.inheritance.NewBox;

public class TestBox {

	public static void main(String[] args) {
		Box A = new Box();
		A.calculateArea(8, 9);
		
		System.out.println("------------");
		
		NewBox B=new NewBox();
		B.calculateArea(5, 10);
		B.calculateVolume(2,3,4);
 
	}

}
