package secondDay.inheritance;

/*Inheritance is the property when a class 
  acquires the properties of another class*/

/*NewBox Class can be referred as the Child class or SubClass*/
public class NewBox extends Box {
	
	public void calculateVolume(int length,int width,int height) {
		System.out.println("Volume = " + length*width*height);
 	}
}
