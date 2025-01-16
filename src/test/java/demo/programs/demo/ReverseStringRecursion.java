 package demo.programs.demo;

import java.util.Scanner;

public class ReverseStringRecursion {
	static String s="Resume";
	static String s1="";
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();*/
		
		int n=s.length()-1;
		reverse(n);
		System.out.println(s1);
	}
	static void reverse(int n)
	{
		if(n>=0){
		s1=s1+s.charAt(n);
		n--;
		reverse(n);
	}
		
	}

}
