package Whilee;

import java.util.Scanner;

public class countNumbersofDigits {
public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
System.out.println("enter the digits");
int digits=sc.nextInt();
	//int num=12345;
	int count=0;
	while(digits!=0)
	{
		count++;
		digits=digits/10;
		
	}
	System.out.println(count);
}
}
