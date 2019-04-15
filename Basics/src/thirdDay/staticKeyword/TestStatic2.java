package thirdDay.staticKeyword;

public class TestStatic2 {

	public static void main(String[] args) {
		ExampleStatic obj=new ExampleStatic();
		
		obj.staticMethod();
		obj.staticMethod();
		ExampleStatic.staticMethod();
		obj.nonStaticMethod();
		obj.nonStaticMethod();
		 
		System.out.println("--------------");
		
		ExampleStatic obj2=new ExampleStatic();
		
		/*static is one per class,so any number of objects u 
		 create it is going to use same data.
		 Very useful while creating counters(website counters)*/
		obj2.staticMethod();
		obj2.staticMethod();
		
		/*Non-static is one per object;i.e for every 
		object it has a fresh copy of variables */
		obj2.nonStaticMethod();
		obj2.nonStaticMethod();
	}

}
