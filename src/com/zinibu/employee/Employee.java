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
	
	private String name;
	private Date hireDay;
	private double salary;

}

