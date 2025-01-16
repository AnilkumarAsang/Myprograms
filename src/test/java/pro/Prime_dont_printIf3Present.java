package pro;

import java.util.Scanner;

public class Prime_dont_printIf3Present {
	public static void main(String[] args) {
		 int count=0;int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value and this value is not present in the prime");
		int nn=sc.nextInt();
		System.out.println("enter the second value");
	int	num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;

			}
		}
		if(count==2)
		{ 
			int org=num;
			while(num!=0)
			{
				int a=num%10;
				if(a!=nn)
				
					num=num/10;
				
				else
				{
					flag=1;
					System.out.println("invalid");
					break;
				}

				if(flag!=1)
				{
					System.out.println("org "+org);
				}
			}
		}
		else
		{
			System.out.println("not a prime");
		}
	}
}

