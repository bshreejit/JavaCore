package thirdDay.finalKeyword;


//ExampleFinal2 class can't be sub-classed
public final class ExampleFinal2 extends ExampleFinalKeyword{
	public void methodA() {
		System.out.println("MethodA overridden");
	}
	
	
	//Method B can't be overridden
	/*public void methodB() {
		System.out.println("Hello");
	}*/
}
