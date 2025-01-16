package demo.programs.demo;
import java.util.Scanner;

public class ReverseStringWhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string value:");
		String s=sc.next();
		String s1="";
		int i=s.length()-1;
		while(i>=0)
		{
			s1=s1+s.charAt(i);
			i--;
		}
		System.out.println(s1);
	}

}
