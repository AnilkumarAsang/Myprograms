package Whilee;

import java.util.Scanner;

public class add_oddNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the value");
	int num=sc.nextInt();
	int odd=0,even=0;int count=0,count1=0;
	while(num!=0)
	{
		int a=num%10;
		if(a%2==1)
		{
			odd=odd+a;
			count++;
		}
		else
		{
			even=even+a;
			count1++;
		}
		num=num/10;
	}
	System.out.println("this is for odd number addition:=" + odd);
	System.out.println("this is for even number addition:= "+ even);
	System.out.println("count of odd number "+count);
	System.out.println("count of even number "+count1);
	
	
}}