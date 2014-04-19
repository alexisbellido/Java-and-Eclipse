package com.zinibu.employee;

import java.util.*;

public class Employee
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
		return sayHi();
	}
	
	public Date getHireDay()
	{
		return (Date) hireDay.clone();
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	/**
	 * @return String salutation and name
	 */
	private String sayHi()
	{
		return "super dear " + name;
	}
	
	public static String sayCompanyName()
	{
		return "Acme Company";
	}
	
	private final String name; // we set final because name won't change after the object is created.
	private Date hireDay;
	private double salary;
	public static final int ID = 123; // static constant, so there's only this one for the class, instead of one per instance
	
	public static void main(String[] args) {
		Employee e = new Employee("Mike", 102.47, 2010, 2, 1);
		System.out.println("Hey from Employee class main " + e.getName() + ", you were hired on " + e.getHireDay() + " and your salary is now " + e.getSalary());

	}

}

