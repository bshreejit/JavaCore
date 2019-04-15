package thirdDay.staticKeyword;

public class TestStatic {

	public static void main(String[] args) {
		
		ExampleStatic obj=new ExampleStatic();
		/*Even if there are multiple object, the static block of
		 code is only fired once; but for every object, constructor
		  is fired*/
		//ExampleStatic obj2=new ExampleStatic();
		
		obj.nonStaticMethod();
		//obj.staticMethod();
		//But, Static Methods can also be called below mentioned way
		
		/*ClassName.staticMethod();*/
		ExampleStatic.staticMethod();
		//But, Non-static method can't be called using above static implementation
		
	}

}
 