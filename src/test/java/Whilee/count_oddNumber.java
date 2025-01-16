package Whilee;

import java.util.Scanner;

public class count_oddNumber 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the value");
	int num=sc.nextInt();//124578
	int count=0,oddaddition=0;
	while(num!=0)
	{
		int a=num%10;
		if(a%2==1)
		{
			count++;
			oddaddition=oddaddition+a;
			}
			num=num/10;
		}
		System.out.println("count of odd numbers only: "+ count);
		System.out.println("addition of odd numbers only: "+ oddaddition);
	}}
/*OUTPUT:-count of odd numbers only: 2
addition of odd numbers only: 4
*/
