package com.products;

import java.util.Scanner;

public class ArrayDemo 
{
	
	public int arrayDemo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size :");
		int asize = sc.nextInt();
		
		int[] a=new int[asize];
		int sum=0;
		System.out.println("enter the afrray elements :");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("a["+i+"]=");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		//System.out.println("sum of aray is :" + sum);
		return sum;
	}
	

	public static void main(String[] args) 
	{
		ArrayDemo demo=new ArrayDemo();
		int count = demo.arrayDemo();
		System.out.println("Count of array :" + count);

	}

}
