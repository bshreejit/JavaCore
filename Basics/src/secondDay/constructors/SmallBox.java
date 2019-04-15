package secondDay.constructors;

public class SmallBox {
	int length;
	int width;
	
	//Defining Constructor
	SmallBox(){
		this.length=8;//Class level Object taken
		this.width=10;
		System.out.println("Constructor Created");
	}
	
	SmallBox(int len,int wid){
		this.length=len;//Class level Object taken
		this.width=wid;
		System.out.println("Constructor Created");
	}
	
	int Area() {
		int A=length*width;
		return A;
	}
}
