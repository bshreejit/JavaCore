package secondDay.examples;

public class TestThisKeyword {

	public static void main(String[] args) {
		ThisKeyword A = new ThisKeyword();
		A.length = 4;
		A.width = 6;
		int p = A.calcArea(5, 9);
		System.out.println("Area : " + p);
	}

}
