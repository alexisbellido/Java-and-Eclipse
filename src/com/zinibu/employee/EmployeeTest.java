package com.zinibu.employee;


public class EmployeeTest {
	
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Carl Cracken", 25.50, 2012, 10, 3);
		staff[1] = new Employee("David Smith", 35.20, 2011, 11, 2);
		staff[2] = new Employee("John Perez", 102.00, 2000, 5, 1);
		
		for (Employee e: staff)
		{
			e.raiseSalary(5);
			System.out.println("Hello " + e.getName() + ", you were hired on " + e.getHireDay() + " and your salary is now " + e.getSalary());
		}
		
		System.out.println("The id for the Employee class is " + Employee.ID);
		System.out.println("The company name for all employees is " + Employee.sayCompanyName());
		
		
	}

}