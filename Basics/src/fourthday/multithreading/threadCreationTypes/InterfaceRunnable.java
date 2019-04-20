package fourthday.multithreading.threadCreationTypes;

public class InterfaceRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello from Thread");
	}
	
	public static void main(String[] args) {
		InterfaceRunnable t=new InterfaceRunnable();
		Thread thread=new Thread(t);
		thread.start();
	}
}
