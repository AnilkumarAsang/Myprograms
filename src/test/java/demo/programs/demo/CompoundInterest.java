package demo.programs.demo;

import java.util.Scanner;

public class CompoundInterest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal amount:");
		double p=sc.nextDouble();
		System.out.println("Enter the rate of interest:");
		double r=sc.nextDouble();
		System.out.println("Enter the no of years:");
		double t=sc.nextDouble();
		double amount=p*Math.pow(1+(r/100),t);
		double ci=amount-p;
		System.out.println(ci);
	}

}
