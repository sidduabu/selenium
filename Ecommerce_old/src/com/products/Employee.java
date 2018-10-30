package com.products;

public class Employee 
{
	int eno;
	String ename;
	
	
	public Employee()
	{
		System.out.println("iam default constructor...");
	}
	
	public Employee(int eno, String ename) 
	{
		this.eno=eno;
		this.ename=ename;
	}

	public static void main(String[] args) 
	{
		
		Employee e1=new Employee(1744,"ravilella");
		System.out.println(e1.eno);
		System.out.println(e1.ename);
		
		
		Employee e2=new Employee(1745,"sai");
		System.out.println(e2.eno);
		System.out.println(e2.ename);
		
	}

}
