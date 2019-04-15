package secondDay.project;

public class TestCompany {

	public static void main(String[] args) {

		Employee Shreejit = new Employee("Shreejit Bhattarai", 3);
		Employee Subeg = new Employee("Subeg Aryal", 4);
		Employee Sujan = new Employee("Sujan Dhakal", 7);
		Employee Suraj = new Employee("Suraj Adhikari", 8);

		Department sales = new Department("XYZ sales.");
		Department IT = new Department("XYZ IT.");
	 	
		//adding employee to sales department
		sales.addEmployee(Shreejit);
		sales.addEmployee(Subeg);
		
		//adding employee to IT department
		IT.addEmployee(Sujan);
		IT.addEmployee(Suraj);
		
		sales.describe();
		IT.describe();
	}

}
