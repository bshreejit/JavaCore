package fourthday.multithreading;

public class MultiThreadingDemo extends Thread{

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	/*All the threads execute parallely; o/p 111222333
	 public static void main(String[] args) {
		MultiThreadingDemo1 t1=new MultiThreadingDemo1();
		MultiThreadingDemo1 t2=new MultiThreadingDemo1();
		MultiThreadingDemo1 t3=new MultiThreadingDemo1();
		t1.start();
		t2.start();
		t3.start();
	}*/
	public static void main(String[] args) {
		MultiThreadingDemo t1=new MultiThreadingDemo();
		MultiThreadingDemo t2=new MultiThreadingDemo();
		MultiThreadingDemo t3=new MultiThreadingDemo();
		t1.start();
		try {
			//t1.join();//Until t1 executes, t2 and t3 enters wait condition
			t1.join(1000);//Upto 1000 millis join() shows its funtionality. 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
		
		t3.start();
		
	}
}
