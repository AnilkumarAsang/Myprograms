package com.practicle.allprogram;

import java.util.Scanner;

public class factorial
{
	public static void main(String[] args) 
	{
		int r=1;
		Scanner sc=new Scanner (System.in);
	System.out.println("enter the number");

		int num=sc.nextInt();
		//int num=10;
		for(int j=1;j<=num;j++)
		{
			int fact=1;
			//int no=j;
			for(int i=j;i>=1;i--)
			{
				fact=fact*i;
			}
			System.out.println(r++ +": "+fact);
		}
	}
}