package com.question1;

public class Employee implements Comparable<Employee> {
	int id; //Implement Comparable to sort Employee on basis
	String name;
	int age;
	double salary;
	public Employee(int id, String name, int age, double salary) {
		super();
		this.id = id;// This keyword refers to current instance itself 
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public int compareTo(Employee e)//compares 
	{
		if(salary==e.age)return 0;
			//comparing the element
		else if(salary>e.salary)return 1;
			else return-1;
	}
}