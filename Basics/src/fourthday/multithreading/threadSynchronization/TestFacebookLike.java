package fourthday.multithreading.threadSynchronization;

public class TestFacebookLike {

	public static void main(String[] args) {
		FacebookLike fb=new FacebookLike(400);
		Thread user1=new Thread(new Runnable() {
			@Override
			public void run() {
				fb.plusOne();			
			}
		});
		Thread user2=new Thread(new Runnable() {
			@Override
			public void run() {
				fb.plusOne();			
			}
		});
		Thread user3=new Thread(new Runnable() {
			@Override
			public void run() {
				fb.plusOne();			
			}
		});
		Thread user4=new Thread(new Runnable() {
			@Override
			public void run() {
				fb.plusOne();			
			}
		});
		
		user1.start();
		user2.start();
		user3.start();
		user4.start();
	}

}
