package secondDay.project;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String deptName;
	private double budget;

	// int[] a=new int[5];
	/* Creating an employee array */
	//private Employee[] emps = new Employee[5];
	
	//Using Concept of collection
	private List<Employee> emps=new ArrayList<>();
	
	private int counter = 0;

	public Department(String deptName) {
		this.deptName = deptName;
		this.budget = 50000; // budget is anyway constant
	}

	public void addEmployee(Employee obj) {
		//emps[counter] = obj;
		
		//To add in collection
		emps.add(obj);
		counter++;

		if (obj.getGrade() >= 5) {
			this.budget += 150000;
		} else if (obj.getGrade() < 5) {
			this.budget += 100000;
		}
	}

	public void describe() {
		String temp = "Dept Name:" + this.deptName + " \nBudget : " 
				+ this.budget + "\nEmployee = ";
		
		
		//Using Enhanced for loop
		/*for (Employee x : emps) {
			if (x != null) {
				temp += x.getEmpInfo() + " ";
			}
		}*/
		
		/*No checking of null required while using collection because
		  while looping through list of objects there ain't gonna be null obj*/
		for (Employee x : emps) {
				//temp += x.getEmpInfo() + " ";
				//temp += x.toString() + " "; toString() not even reqd
				temp += x + " ";
		}
		
		System.out.println(temp);
		System.out.println("-----------");
	}
}
