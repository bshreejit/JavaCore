package com.shreejit.JDBC;


/*Class.forName()*/

//Class is Class & method is forName()

public class ClassForName {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		/*Hello obj=new Hello();//Calling Class by creating object*/		
		
		/*What if you don't want to create the object but 
		  still you want to call the static block; what we can do
		  is we can load the Class Hello , so to load the class we use
		*/
		Class.forName("Hello");
		//We are just loading the class, so only static block is executed
		
		Class.forName("Hello").newInstance();
		//Also creates the object so in this case instant block is also called 
		
	}
}

class Hello{
	//While creating the object it will load the class,and while loading the class it will call static block
	static {
		System.out.println("Static Block");
	}
	
	//And, while creating the object it will call the instance block
	{
		System.out.println("Instance Block");
	}
} 
