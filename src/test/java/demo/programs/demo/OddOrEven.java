package demo.programs.demo;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("number "+num+" is Even");
		}
		else
		{
			System.out.println("number "+num+" is Odd");
		}
	}

}
