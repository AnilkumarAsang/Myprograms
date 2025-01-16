package demo.programs.demo;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int org_num=num;
		int sum=0;
		while(num!=0)
		{
		int a=num%10;
		sum=sum+(a*a*a);
		num=num/10;
		}
		if(sum==org_num)
		{
			System.out.println(org_num+" is a Armstrong number");
		}
		else
		{
			System.out.println(org_num+" is not a Armstrong number");
			
		}
	}

}
