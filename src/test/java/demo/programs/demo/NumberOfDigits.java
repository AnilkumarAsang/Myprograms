package demo.programs.demo;

import java.util.Scanner;

public class NumberOfDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int org_num=num;
		int count = 0;
		while(num!=0)
		{
			num=num/10;
			count++;
			
		}
		System.out.println(org_num+" is having "+count+" digits");
	}

}
