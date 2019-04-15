package secondDay.overriding;


//subClass
public class NewBox extends Box{
	public void calculateVolume(int length,int width,int height) {
		System.out.println("Volume = " + length*width*height);
 	}
	public void calculateArea(int length, int width) {
		System.out.println("Sub Area = " + (length/width));
		
	}
}
