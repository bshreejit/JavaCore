package thirdDay.exceptionHandling.throwAndThrows;

public class ProgA {
	public int divideNumbers(int a,int b) throws Exception {
		int c = 0;
		try {
			c=a/b;
		} catch (Exception e) {
			System.out.println("Program A Exception");
			throw new Exception("Please check your Numbers");
		}
		
		return c;
	}	
} 
