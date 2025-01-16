package com.practicle.allprogram;

import java.util.Scanner;

public class armstrong_range 
{
public static void main(String[] args)
{
Scanner sc=new Scanner (System.in);
System.out.println("enter the number");
int num1 = sc.nextInt();
System.out.println("enter the number2");
int num2=sc.nextInt();//1to 200
for(int i=0;i<=num2;i++)
{
boolean arm=checkitsarmstrong(i);
if(arm)
	System.out.println(i);
}
}
public static boolean checkitsarmstrong(int num)
{
	int sum=0;
	int comp=num;
	
	while(num!=0)
	{
		int a=num%10;
		sum=sum+(a*a*a);
		num=num/10;
	}
	if(comp==sum)
		return true;
	else 
		return false;
}}
