package demo.programs.demo;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a principal amount:");
		double p=sc.nextDouble();
		System.out.println("Enter rate of interest:");
		double r=sc.nextDouble();
		System.out.println("Enter no of years");
		double t=sc.nextDouble();
		double si=(p*t*r)/100;
		System.out.println(si);
		
	}

}
