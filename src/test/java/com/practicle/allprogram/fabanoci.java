package com.practicle.allprogram;

import java.util.Scanner;

public class fabanoci {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the number");
	int fib1 = sc.nextInt();
	System.out.println("enter the 2nd number");
	int fib2=sc.nextInt();
	int fib3;
	System.out.println(fib1+" "+fib2+" ");
	for(int i=1;i<=5;i++)
	{
		fib3=fib1+fib2;//0+1=1
		fib1=fib2;
		fib2=fib3;
		System.out.println(fib3);
	}
}
}
