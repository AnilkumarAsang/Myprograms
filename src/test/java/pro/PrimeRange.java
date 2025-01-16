package pro;

import java.util.Scanner;

public class PrimeRange {
	public static void main(String[] args) {
//		int num=i;
//		int flag=0,count=0; 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int num=sc.nextInt();
		System.out.println("enter 2");
		int num2=sc.nextInt();
		for(int i=num;i<num2;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					//flag=1;
					count++;
				}
			}
			if(count==2  )
				System.out.println(i+" is a prime no");
			else
				System.out.println(i+" is not a prime no");
		}

	}
}