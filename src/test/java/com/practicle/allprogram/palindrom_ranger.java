package com.practicle.allprogram;
import java.util.Scanner;
public class palindrom_ranger 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the value");
		int num1 = sc.nextInt();//10
		System.out.println("enter the number");
		int num2 = sc.nextInt(); //20
		for(int i=num1;i<=num2;i++)
		{
			boolean check=checkitspalindrom(i);
			if(check)
				System.out.println("**palindrom numbers*** "+i+" ");
			else
				System.out.println("**not pali nos**: "+i+" ");	
		}
	}
	public static boolean checkitspalindrom(int num)
	{
		int sum=0;
		int temp=num;
		while(num!=0)
		{
			int add = num%10;
			sum=(sum*10)+add;
			num=num/10;
		}
		if(temp==sum)
			return true;
		else
			return false;
	}
}


