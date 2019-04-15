package firstday.examples;

public class AndOr {
	public static void main(String[] args) {
		int x,y;
		x=10;
		y=20;
		int sum,diff;
		if(x>0 && y>0)
		{
			sum=x+y;
			System.out.println("Result="+sum);
		}
		if(x>0 || y>10)
		{
			diff=x-y;
			System.out.println("Result="+diff);
		}
	}
}
