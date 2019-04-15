package thirdDay.variableArguments;

//What if the number of integers are unknown
//sum method will receive any number of integers
public class VariabelArgumentExample {
	public static int sum(int ...a) {
		int sum = 0;
		//a will be the array created
		for (int temp : a) {
			sum += temp;
		}
		return sum;
	}

	public static void main(String[] args) {
		int p = sum(4, 5, 6 , 65 ,345, 546);
		//the numbers can be infinite
		System.out.println(p);
	}
}
