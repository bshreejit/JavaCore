package thirdDay.superKeyword;

public class SubBox extends Box{
	
	public void calculateVolume(int length,int width, int height) {
		
		double volume=super.calculateArea(length, width)*height;
		//super keyword is used to call the data or method of superclass
		
		System.out.println("Volume : "+volume);
		
	}
}
