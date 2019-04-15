package thirdDay.exceptionHandling.throwAndThrows;

public class ProgB {
	public static void main(String[] args)  {
		ProgA obj=new ProgA();
		//System.out.println(obj.divideNumbers(10, 2));
		try {
			System.out.println(obj.divideNumbers(10, 0));
		} catch (Exception e) {
			System.out.println("Program B : " +e.getMessage());
		}
		
	}
}
