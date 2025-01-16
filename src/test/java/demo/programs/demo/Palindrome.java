package demo.programs.demo;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int rev=0,org_num=num;
		while(num!=0)
		{
			int a=num%10;
			rev=(rev*10)+a;
			num=num/10;
		}
		if(rev==org_num)
		{
			System.out.println(org_num+" is a palindrome");
		}
		else
		{
			System.out.println(org_num+" is not a palindrome");
		}
		
	}

}
