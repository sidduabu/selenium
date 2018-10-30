package com.products;

public class CalculatorConstructor 
{
	int a,b,c;
	
	public CalculatorConstructor(int a, int b, int c) 
	{
		this(100,200);
		
		this.a=a;
		this.b=b;
		this.c=c;
		
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
	}


	public CalculatorConstructor(int a, int b) 
	{
		this(1000);
		
		this.a=a;
		this.b=b;
		
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
	}


	public CalculatorConstructor(int a) 
	{
		this();
		this.a=a;
		
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
	}
	
	
	public CalculatorConstructor() 
	{
		System.out.println("iam default constructor");
	}


	public static void main(String[] args) 
	{
		CalculatorConstructor x=new CalculatorConstructor(10,20,30);
		
				
	}

}
