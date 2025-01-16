package demo.programs.demo;

import java.util.Scanner;

public class Print10t01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		num(n);
	}
	
	static void num(int n)
	{
		if(n!=0){
		System.out.println(n);
		n--;
		num(n);
	}
	}

}
