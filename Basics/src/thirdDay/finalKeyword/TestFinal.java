package thirdDay.finalKeyword;

public class TestFinal {

	public static void main(String[] args) {
		ExampleFinal2 fk = new ExampleFinal2();
		fk.methodA();//is overridden by methodA in ExampleFinal2 class
		fk.methodB();//original methodB is called from ExampleFinalKeyowrd class
	}

}
