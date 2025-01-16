package demo.programs.demo;

import java.util.Scanner;

public class LargestOfTwo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for a:");
		int a=sc.nextInt();
		System.out.println("Enter value for b:");
		int b=sc.nextInt();
		if(a>b)
		{
			System.out.println("Largest value is "+a);
		}
		else
		{
			System.out.println("largest value is "+b);
		}
	}

}
