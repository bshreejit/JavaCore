package thirdDay.interfaces;

public class TestOffice {

	public static void main(String[] args) {
		
		Office obj=new Word();
		obj.Open();
		
		obj=new Excel();
		obj.Save();
		
	}

}
