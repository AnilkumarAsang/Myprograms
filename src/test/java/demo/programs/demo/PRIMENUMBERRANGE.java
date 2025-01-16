package demo.programs.demo;

import java.util.Scanner;

public class PRIMENUMBERRANGE {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value");
	int num=sc.nextInt();
	int sum=0; int sum1=0;
	for(int prime=1;prime<=num; prime++)
	{
		int count=0;
		for(int mod=1;mod<=prime;mod++)
		{
			if(prime%mod==0)
			{
				count++;
			}
		}
		
		if(count==2)
		{
			sum=sum+prime;
			System.out.println("***its a prime number*** "+prime);
			System.out.println("addition of Prime number: "+sum);
			System.out.println("****************Prime End*****************");
		}
		else
			{
			sum1=sum1+prime;
			System.out.println("---its not a prime number--- "+prime);
		
		System.out.println("addition of Non Prime nos: "+sum1);
		System.out.println("-----------------Not Prime End---------------");
	}
	
	}
}
}
