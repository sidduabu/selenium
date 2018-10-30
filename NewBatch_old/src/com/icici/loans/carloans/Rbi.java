package com.icici.loans.carloans;

public interface Rbi 
{
	public void deposit();
	public void withdrawl();
	
	public static void main(String[] args) 
	{
		Rbi i;
		
		i=new Hdfc();
		i.deposit();
		i.withdrawl();
		
		i=new Icici();
		i.deposit();
		i.withdrawl();
		
	}
	
}
