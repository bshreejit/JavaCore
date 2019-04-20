package fourthday.multithreading.threadSynchronization;

public class FacebookLike {
	
	private int likes;
	 
	public FacebookLike(int likes) {
		this.likes=likes;
		
	}
	/*Not synchronized; Data will be corrupt o/p: 400
	public void plusOne()
	{
		System.out.println(likes);
		try {
			Thread.sleep(500);
			likes++;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}*/
	
	/*In above method without sync, at once every thread executes
	  the method, so data is corrupted and shows unusual behavior.
	  But using sync, when when a thread executes a method other
	  thread wanting to use it stays in wait condition */
	public synchronized void plusOne()
	{
		System.out.println(likes);
		try {
			Thread.sleep(500);
			likes++;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
