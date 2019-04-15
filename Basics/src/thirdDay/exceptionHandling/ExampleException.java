package thirdDay.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExampleException {

	public static void main(String[] args) {

		int d[]=new int[3];
		int a=10;
		int b=0;
		int c=0;
		 
		//c=a/d; Its compile time error and immediately notifies.Cause d is an array 
		
		/*c=a/b; But, compiler wont know it will give error. 
		 So at runtime it tries to a/b and it hence can't and 
		 throws runtime error*/
		
		try {
			d[2]=10;
			c=a/b; 
			//return;
		}
		//TO catch multiple Exceptions
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOut = "+e);
		}
		//ACTUAL MULTIPLE EXCEPTION
		catch(NumberFormatException | ArithmeticException e){
			System.out.println(e);
		}
		//Will catch other exception (General Exception)
		catch(Exception e){
			System.out.println("Exception Occured!!! ");
			//To know which exception has occurred
			System.out.println("Exception Occured!! " + e );
			e.printStackTrace();
		}
		/*Finally{} will always run even if it has an exception
		  or not. It will run even if try returns. in this case,
		  below syso "C=" wont be printed*/
		finally {
			System.out.println("Finally Code");
		}
		
		System.out.println("C = "+c);
	}

}
