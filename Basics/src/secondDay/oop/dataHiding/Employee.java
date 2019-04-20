package secondDay.oop.dataHiding;

public class Employee {
	private double salary;/*here salary is only
	 visible and can be set in this current class only */
	private double bonus;

// Not mentioning anything means default access
// modifier and default access modifier can be
// in class as well as package unlike private
	 
	/*void setSalary(double salary) {

		if (salary >= 40000 && salary <= 100000) {
			this.salary = salary;
		} else {
			this.salary = 0;
			System.out.println("Check the salary!!");
		}
	}*/


	//But better to put it as public
	public void setSalary(double salary) {

		if (salary >= 40000 && salary <= 100000) {
			this.salary = salary;
		} else {
			this.salary = 0;
			System.out.println("Check the salary!!");
		}
	}
	
	//All it does is return salary to the main method
	public double getSalary() {
		return salary;
	}
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	void CalculateTotalPay() {
		double totalPay = salary + bonus;
		System.out.println("Total = " + totalPay);
	}
}
