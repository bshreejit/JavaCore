package fourthday.multithreading;

public class GarbageDemo {
	
	public static void main(String[] args) {
		GarbageDemo gb1=new GarbageDemo();
		GarbageDemo gb2=new GarbageDemo();
		GarbageDemo gb3=new GarbageDemo();
		
		
		System.out.println(gb1);
		System.out.println(gb2);
		System.out.println(gb3);
		//Object Id is printed
		System.out.println("========");

		gb1=null;
		//gb2=null;
		//when gb1=null is done the reln of object gb1 with its memory is break 
		System.out.println(gb1);
		System.out.println(gb2);
		System.out.println(gb3);
		
		//We have a method for garbage collection
		System.gc();
	}
	
	//Finalize method is the method of the Default Object Class 
	public void finalize() {
		System.out.println("finalize method called");
	}
	//Finalize is called for every null object
	//Finalizing method help to throw out from the memory

	
	/*But, no need to do it as it is automatically maintained 
	  using in built algorithm*/
}
