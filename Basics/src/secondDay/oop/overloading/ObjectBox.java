package secondDay.oop.overloading;

public class ObjectBox {

	public static void main(String[] args) {
		Box A=new Box();
		A.calculateArea((int) 4);
		System.out.println("----------");
		A.calculateArea(4.22222222222);
		System.out.println("-----------");
		A.calculateArea(4, 8);
	}
}
