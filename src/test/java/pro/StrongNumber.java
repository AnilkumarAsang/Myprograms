package pro;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int org=num;
		int sum=0;
		while(num!=0)
		{
			int a=num%10;
			sum=sum+fact(a);
			num=num/10;
			
		}
		if(sum==org)
			System.out.println("Stong number");
		else
			System.out.println("Not a strong number");
	}
	
	public static int fact(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

}
