package thirdDay.abstractClass;

public abstract class Container {
	public void calculateVolume(int length, int height) {
		double volume =calculateAreaOfBase(length)*height;
		System.out.println("Volume = "+volume);
	}
	
	
	public abstract double calculateAreaOfBase(int length);
	/*This method is declared right here but not defined.
	 * Its because this method have two separate values for
	 * base of cylinder i.e circle and base of cube i.e square.
	 * So this is an empty method and abstract keyword is used 
	 * The class which contains the abstract method is also the
	 * abstract class and used abstract keyword.
	 * */
}
