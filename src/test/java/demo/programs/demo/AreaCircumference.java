package demo.programs.demo;

import java.util.Scanner;

public class AreaCircumference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a radius:");
		double r=sc.nextDouble();
		final double pi=3.142;
		double area=pi*r*r;
		double cir=2*pi*r;
		System.out.println(area);
		System.out.println(cir);
	}

}
