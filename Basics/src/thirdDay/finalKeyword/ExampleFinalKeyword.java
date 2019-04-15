package thirdDay.finalKeyword;

public class ExampleFinalKeyword {
	/*"final" keyword can be applied to
	a>Data
	b>Methods
	c>Classes
	
	1.Final Data
		is a constant and can't be changed.
	2.Final Method
		can't be overridden
	3.Final Class
		cann't be sub-classed. 
	 */
	final double pi=3.14;//declaring constant value, can't change this data
	
	//can be overridden
	public void methodA() {
		//pi=4.0;//can't be changed
		System.out.println("PI = "+pi);
	}
	//can't be overridden 
	public final void methodB() {
		System.out.println("Final Method");
	}
}
