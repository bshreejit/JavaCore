package secondDay.examples;

public class Employee {
	 double salary;
	 double bonus;

	public void CalculateTotalPay() {
		double totalPay = salary + bonus;
		System.out.println("Total = "+totalPay);
	}
}
