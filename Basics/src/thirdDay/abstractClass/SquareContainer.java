package thirdDay.abstractClass;

public class SquareContainer extends Container {

	@Override
	public double calculateAreaOfBase(int length) {
		double base = length * length;
		System.out.println("Area of the Square : "+ base);
		return base;
	}

}
