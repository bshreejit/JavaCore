package secondDay.oop.dataHiding;

public class TestEmployee {
	public static void main(String[] args) {
		
		Employee Alex=new Employee();
		
		//Alex.salary=100000; Can't be set here because its declared private in class
		Alex.setSalary(100000);
		Alex.setBonus(5000);
		Alex.CalculateTotalPay();
		
		/*System.out. println(Alex.salary);
		 * Not possible until you mention getSalary method
		 * in the class 
		 * */
		System.out.println("Salary = "+Alex.getSalary());
		System.out.println("Bonus = "+Alex.getBonus());
	}
}
