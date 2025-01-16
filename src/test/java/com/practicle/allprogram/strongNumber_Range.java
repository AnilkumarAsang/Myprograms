package com.practicle.allprogram;
import java.util.Scanner;
public class strongNumber_Range 
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner (System.in);
		//System.out.println("enter the number1");
		//int num1 = sc.nextInt();
		System.out.println("enter the number2");
		int num2 = sc.nextInt(); int cop=num2;
		for(int i=1;i<=num2;i++)
		{
			boolean check=checkitsStrongNumber(i);
			if(check)
				System.out.println("its strong number "+i);
		}
	}
	public static boolean checkitsStrongNumber(int num)
	{
		int sum=0;
		int	comp=num;
		while(num!=0)
		{
			int a=num%10;
			int fact=1;
			for(int i=a;i>=1;i--)
			{
				fact=fact*i;
			}
			num=num/10;
			sum=sum+fact;
		}
		if(comp==sum)
			return true;
		else 
			return false;
	}
}
