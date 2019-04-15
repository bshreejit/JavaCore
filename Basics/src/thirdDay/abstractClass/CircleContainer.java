package thirdDay.abstractClass;

public class CircleContainer extends Container{

	@Override
	public double calculateAreaOfBase(int length) {
		double base=Math.PI*(length/2)*(length/2);
		System.out.println("Area of the Circle : "+ base);
		return base;
	}

}
