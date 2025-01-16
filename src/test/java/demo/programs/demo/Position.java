package demo.programs.demo;
import java.util.Scanner;

public class Position {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string");
		String s1=sc.next();
		String s2="";
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
		s2=s2+s1.charAt(i);	
		}
		System.out.println(s2);
		
	}

}
