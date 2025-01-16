package demo.programs.demo;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int org_num=num;
		int sum=0;
		
		while(num!=0)
		{
			int a=num%10;
			int fact=1;
			for(int i=1;i<=a;i++)//123 =1+2+6=9
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(sum==org_num)
		{
			System.out.println(sum+" is a strong number");
		}
		else
		{
			System.out.println(sum+" is not a strong number");
			
		}
	}

}
