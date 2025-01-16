package com.practicle.allprogram;

import java.util.Scanner;

public class rangefactorial {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value");
	int num=sc.nextInt();
	for(int i=1;i<=num;i++)
	{
		int fact=1;
		for(int j=i;j>=1;j--)
		{
			fact=fact*j;
		}
		System.out.println(fact);
	}
}
}
