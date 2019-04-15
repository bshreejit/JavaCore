package secondDay.oop.overloading;

public class Box {
	
	//Takes one  argument of length of int data type
	void calculateArea(int length) {
		System.out.println("Square Area = " +(length*length));
	}
	
	//Takes length of double data type
	void calculateArea(double length) {
		System.out.println("Double Area = " +(length*length));
	}
	
	//Takes two argument length and width of int type
	void calculateArea(int length,int width) {
		System.out.println("Rectangle Area = " +(length*width));
	}
}
 