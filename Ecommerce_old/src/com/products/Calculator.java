package com.products;

public class Calculator 
{
	int a,b,c;
	

	public Calculator(int a, int b) 
	{
		this.a=a;
		this.b=b;
		
		System.out.println(this.a);
		System.out.println(this.b);
	}
	
	
	public void add()
	{
		c=a+b;
		System.out.println("Addition :" + c);
	}
	
	public void mul()
	{
		c=a*b;
		System.out.println("Multiplication : " + c);
	}
	


	public static void main(String[] args) 
	{
		//addition
		Calculator obj1=new Calculator(10,20);
		obj1.add();
		
		//multiplication
		Calculator obj2=new Calculator(3,2);
		obj2.mul();

	}

}
