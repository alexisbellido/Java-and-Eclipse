package com.zinibu.stocks;

import com.zinibu.employee.Employee;


public class Stock {
	public static void main(String[] args) {
		Employee mike = new Employee("John Perez", 102.00, 2000, 5, 1);
		sayHi(mike.getName());
		System.out.println(getNumber());
	}
	
	private static int getNumber() {
		return 4;
	}
	
	private static void sayHi(String name) {
		System.out.println("Hi, " + name);
		System.out.println("I hope you are doing great!");
	}
	
}
