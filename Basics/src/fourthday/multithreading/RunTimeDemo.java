package fourthday.multithreading;

import java.io.IOException;

public class RunTimeDemo {

	public static void main(String[] args) {
		
			Runtime rt= Runtime.getRuntime();
			try {
				rt.exec("calc.exe");
				rt.exec("notepad.exe");
				rt.exec("E:\\Java\\eclipse\\eclipse.exe");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
}
