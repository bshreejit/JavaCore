package fourthday.multithreading.threadCreationTypes;

public class ThreadClass extends Thread{
	
	public void run() {
		System.out.println("Hello from thread");
	}
	/*
	It overrides the thread, and start() looses the ability to call the thread internally 
	public void start() {
		System.out.println("Hello from start");
	}*/
	
	public static void main(String[] args) {
		
		//Object creation is the NEW STATE
		ThreadClass thread=new ThreadClass();
		
		//thread.run();It can be called directly but not recommended
		
		//START() is called the RUNNABLE STATE 
		thread.start();//Recommended, main funtion is to call the thread internally
	}
}
