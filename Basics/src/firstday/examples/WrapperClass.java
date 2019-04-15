package firstday.examples;

public class WrapperClass {
	public static void main(String[] args) {

		// FOR STRING TO INTEGER
		String a = "4822222";
		// int div=a/2;
		// here 'a' can't be divided as it's a string
		// so concept of WRAPPER CLASS is developed to solve it
		int b = Integer.parseInt(a);
		// NOW
		int div = b / 2;
		System.out.println(div);

		
		System.out.println("-------------");
		
		
		// FOR STRING TO Double
		String salary = "48222.22";
		// double div=salary/2; ERROR OCCURS
		double d = Double.parseDouble(salary);
		// NOW
		double div1 = d / 2;
		System.out.println(div1);
		
		
	}
}
