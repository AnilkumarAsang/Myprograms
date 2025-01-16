package demo.programs.demo;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		String copy=s;
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		if(s1.equals(copy))
		{
			System.out.println("palindrome string");
		}
		else
		{
			System.out.println("not a palindrome string");
		}

}
}