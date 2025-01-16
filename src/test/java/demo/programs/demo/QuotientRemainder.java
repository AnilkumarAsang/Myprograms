package demo.programs.demo;

import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value for a:");
		int a=sc.nextInt();
		System.out.println("Enter a value for b:");
		int b=sc.nextInt();
		int c=a/b;
		int d=a%b;
		System.out.println("Quotient of a and b is "+c);
		System.out.println("Remainder of a and b is "+d);
	}

}
