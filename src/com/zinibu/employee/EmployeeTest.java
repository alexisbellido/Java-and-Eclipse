package com.zinibu.employee;

import java.util.*;

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

	}

}

class Employee
{
	public Employee(String n, double s, int year, int month, int day)
	{
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		hireDay = calendar.getTime();
	}
	
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Date getHireDay()
	{
		return hireDay;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	private String name;
	private double salary;
	private Date hireDay;

}
