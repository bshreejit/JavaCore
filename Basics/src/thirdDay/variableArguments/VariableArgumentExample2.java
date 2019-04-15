package thirdDay.variableArguments;

public class VariableArgumentExample2 {
	
	/*Can't put String or any other type post int ...a
	 *cause it wouldn't be able to know where the int 
	 *array will end. 
	 */
	public static void sum(String b,double c, int ...a) {
		int sum = 0;
		//a will be the array created
		for (int temp : a) {
			sum += temp;
		}
		System.out.println(sum);
		System.out.println(b);
		System.out.println(c);
	}

	public static void main(String[] args) {
		sum("Hello",654.6546, 4, 5, 6 , 65 ,345, 546);
		//the numbers can be infinite
		;
	}
}
