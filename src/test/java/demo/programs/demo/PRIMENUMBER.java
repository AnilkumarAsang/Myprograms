package demo.programs.demo;

import java.util.Scanner;

public class PRIMENUMBER {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int num = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("its prime number");
		} else {
			System.out.println("its not a prime number");
		}
	}
}
