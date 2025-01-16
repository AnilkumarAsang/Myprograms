package Whilee;

import java.util.Scanner;

public class sum_given_number 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the value");
	int num=sc.nextInt();//123
	int sum=0;//3,5,6
	
	while(num!=0)//123,12,1,0
	{
		int s=num%10;//0+3=3+2=5,5+1=6//-this is easy method as compare to our before method
		sum=sum+s;
		num=num/10;//12,1,0
	}
	System.out.println(sum);
		
}}
