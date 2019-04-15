package thirdDay.abstractClass;

public class TestContainer {

	public static void main(String[] args) {
		
		/*CircleContainer c1=new CircleContainer();
		c1.calculateVolume(10,5);
		
		SquareContainer s1=new SquareContainer();
		s1.calculateVolume(10,5);*/
		
		/*Alternate way of creating objects
		  i.e superclass obj=new subclass();*/
		Container c1=new CircleContainer();
		c1.calculateVolume(10,5);
		
		 
		/*Also another use is this is that we
		 * can reuse the previously created object c1*/
		c1=new SquareContainer();
		c1.calculateVolume(10,5);
		
	}

}
