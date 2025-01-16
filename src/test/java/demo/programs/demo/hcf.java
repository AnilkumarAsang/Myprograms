package demo.programs.demo;
import java.util.Scanner;

public class hcf {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value for a:");
		int a=sc.nextInt();
		System.out.println("enter value for b:");
		int b=sc.nextInt();
		while (a!=b)
		{
			if(a>b)
			{
				a=a-b;
			}
			
			if(b>a)
			{
				b=b-a;
			}		
		}	
		if(a==b)
		{
			System.out.println(b);
		}
	}
}
