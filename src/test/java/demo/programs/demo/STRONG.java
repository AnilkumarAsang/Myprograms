package demo.programs.demo;

import java.util.Scanner;

public class STRONG {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value");
	int num=sc.nextInt();
	int org=num;
	int sum=0;//27,152
	while(num!=0)//15,1
	{
		int a=num%10;
		sum=sum+(a*a*a);//3*3*3=27,5*5*5=125+27=152,152+1=153
		num=num/10;//15,1
		
	}
	if(org==sum)
		System.out.println("its strong number");
	else
		System.out.println("its not a strong number");
}
}
