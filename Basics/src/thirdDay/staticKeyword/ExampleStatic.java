package thirdDay.staticKeyword;


//static is one per class, but not one per object
public class ExampleStatic {
	
	//static data
	static int staticVariable;
	
	int nonStaticVariable;
	
	
	//static method
	static public void staticMethod() {
		System.out.println("Static variable = " + staticVariable);
		staticVariable++;
		//static methods can only use the static data and methods 
	}
	
	public void nonStaticMethod() {
		System.out.println("Non-Static variable = " + nonStaticVariable);
		nonStaticVariable++;
	}
	
	
	//Statement within the static block is fired before constructor at most once
	static {
		System.out.println("Static BLock of code");		
	}
	
	
	//Fired after static block of code, and can be called wrt no. of objects
	ExampleStatic() {
		System.out.println("Constructor");
	}	
}
