package secondDay.examples;

public class TestEmployee {

	public static void main(String[] args) {
		/*Employee alex,linda;
		alex=new Employee();
		linda=new Employee();*/
		
		
		//The above object defination can be written as
		Employee Alex=new Employee();
		Employee Linda = new Employee();
		
		Alex.salary=25000.89;
		Alex.bonus=5656;
		Alex.CalculateTotalPay();
		
		Linda.salary=15000.89;
		Linda.bonus=1656;
		Linda.CalculateTotalPay();
	}

}
