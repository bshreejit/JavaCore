package fourthday.multithreading;

public class FileDownloadTest {

	public static void main(String[] args) {
		FileDownloader t1=new FileDownloader("url1");
		FileDownloader t2=new FileDownloader("url2");
		FileDownloader t3=new FileDownloader("url3");
		t1.start();
		t2.start();
		t3.start();
		
	}

}
