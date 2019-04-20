package fourthday.multithreading;

public class FileDownloader extends Thread{

	
	private String url;
	
	public FileDownloader(String url) {
		this.url=url;
	}
	public void run() {
		FileDownloadMT obj=new FileDownloadMT();
		obj.download(url);
	}
	
}
 