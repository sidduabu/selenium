package com.icici.loans.carloans;

public class ChildClass extends FirstAbstract implements Rbi
{

	public static void main(String[] args) 
	{
		ChildClass obj=new ChildClass();
		obj.m1();
		obj.m2();
		obj.deposit();
		obj.withdrawl();

	}

	@Override
	public void m2() 
	{
		System.out.println("iam m2 overidden in Childclass");
	}
	
	public void m1()
	{
		System.out.println("iam m1 overridden in ChildClass");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawl() {
		// TODO Auto-generated method stub
		
	}

}
