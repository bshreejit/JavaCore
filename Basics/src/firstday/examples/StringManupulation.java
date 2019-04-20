package firstday.examples;

public class StringManupulation {
	public static void main(String[] args) {
		String x = "Shreejit Bhattarai";
		System.out.println("Hello " + x);
		System.out.println("-------------");
		System.out.println(x.toLowerCase());
		System.out.println("-------------");
		System.out.println(x.toUpperCase());
		System.out.println("-------------");
		System.out.println(x.substring(2));

		System.out.println("-------------");
		System.out.println(x.substring(2, 7));
		// from x[2] no to x[7] but upto x[7]

		System.out.println("-------------");
		System.out.println(x.charAt(4));

		System.out.println("-------------");

	}
}
