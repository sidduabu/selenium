package com.icici.loans.carloans;

public class Hdfc implements Rbi
{

	public static void main(String[] args) 
	{
		Hdfc h=new Hdfc();
		h.deposit();
		h.withdrawl();

	}

	@Override
	public void deposit() 
	{
		System.out.println("iam deposit overridden in HDFC");
	}

	@Override
	public void withdrawl() 
	{
		System.out.println("iam withdrawl overridden in HDFC");
	}

}
