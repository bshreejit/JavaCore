package thirdDay.variableArguments;

public class GeneralExample {
	/*public int sum(int a, int b,int c) {
		int sum=a+b+c;
		return sum;
	}
	public static void main(String[] args) {
		GeneralExample su=new GeneralExample();
		int p=su.sum(4,5,6);
		System.out.println(p);
	}*/
	 
	//Above method can be written using static method
	public static int sum(int a, int b,int c) {
		int sum=a+b+c;
		return sum;
	}
	public static void main(String[] args) {
		int p=sum(4,5,6);
		System.out.println(p);
	}
}
