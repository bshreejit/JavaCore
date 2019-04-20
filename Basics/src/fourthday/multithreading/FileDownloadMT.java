package fourthday.multithreading;

public class FileDownloadMT {
	
	public void download(String url) {
		System.out.println("File is downloaded using URL " + url);
	}
	
	/*public static void main(String[] args) {
		FileDownloadMT obj1=new FileDownloadMT();
		obj1.download("url1");
		FileDownloadMT obj2=new FileDownloadMT();
		obj2.download("url2");
		FileDownloadMT obj3=new FileDownloadMT();
		obj2.download("url3");
	}*/

}
