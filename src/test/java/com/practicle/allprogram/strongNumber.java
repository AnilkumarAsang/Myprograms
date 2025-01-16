package com.practicle.allprogram;

import java.util.Scanner;

public class strongNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();//145=4*3*2*1//5*4*3*2*1=145 its strong number
	int org=num;
	int sum=0;
	
	while(num!=0)
	{
		int ab=num%10;
		int fact=1;
		for(int i=ab;i>=1;i--)
		{
			fact=fact*i;
		}
		num=num/10;
		sum=sum+fact;
	}
	System.out.println(sum);
	if(org==sum)
		System.out.println("its strong number");
	else
		System.out.println("its not strong number");
	
}
}
