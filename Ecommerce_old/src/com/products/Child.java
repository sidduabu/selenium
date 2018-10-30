package com.products;

public class Child  extends CalculatorConstructor
{
	int p;
	
	
	public Child(int p) 
	{
		super(10,20,30);
		this.p=p;
		
		System.out.println(this.p);
	}
	
	public void m1()
	{
		System.out.println(this.p);
		System.out.println(super.a);
	}
	

	public static void main(String[] args) 
	{
		Child obj=new Child(1);
		
	}


}
