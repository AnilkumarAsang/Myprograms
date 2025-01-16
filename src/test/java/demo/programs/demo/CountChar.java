package demo.programs.demo;
import java.util.Scanner;

public class CountChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		char ch[]=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a')
			{
				count++;
			}
		}
		System.out.println("count of a is "+count);
	}

}
