package Primenumber;

import java.util.Scanner;

public class Prime_number {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//for(int j = 1;j<3;j++)
	{
		for(int k = 1;k<50;k++)
		{
	System.out.println("srno:"+k+"\n enter the value");
	System.out.println();
	
	int number=sc.nextInt();
	boolean condition=true;
	for(int i=2;i<number;i++)
	{
		
		if(number%i==0)
		{
			condition=false;
	}
		}
if(condition==true)
{
	System.out.println("This is a prime no: " + number);
			
	}
else
{
	System.out.println("This is not a prime number:" + number);
}
}
}
}
}
