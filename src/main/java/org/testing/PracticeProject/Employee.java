package org.testing.PracticeProject;

public class Employee {
	int empId;
	String empName;

	public void display() {
		System.out.println("Employee id is " + empId);
		System.out.println("Employee name is " + empName);
	}

	public static void main(String[] args) {
		// For First employee
		Employee e1 = new Employee();
		e1.empId = 1;
		e1.empName = "Soumya";
		e1.display();

		// For second employee
		Employee e2 = new Employee();
		e2.empId = 2;
		e2.empName = "Nilesh";
		e2.display();

		// For third employee
		Employee e3 = new Employee();
		e3.empId = 3;
		e3.empName = "Raja";
		e3.display();

		// For fourth employee
		Employee e4= new Employee();
		e4.empId = 4;
		e4.empName = "Abhi";
		e4.display();
		
		// For fifth employee
		Employee e5 = new Employee();
		e5.empId = 5;
		e5.empName = "Kaka";
		e5.display();
	}
}
