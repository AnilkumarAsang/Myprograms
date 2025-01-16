package Whilee;

import java.util.Scanner;

public class add_evenNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the value ");
	int num=sc.nextInt();     // 124578;
	int sum=0;
	while(num!=0)
	{
	int even = num%10;
	if(even%2==0)
	{
		sum=sum+even;
	}
	num=num/10;
	}
	
	System.out.println("addition of even numbers only "+ sum);
}
}
