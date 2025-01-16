package com.practicle.allprogram;

import java.util.Scanner;

public class palindromm {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the number");//141
	int number = sc.nextInt(); 
	int comp = number,sum=0;
	while(number!=0)
	{
		sum=(sum*10)+number%10; 
		number=number/10;
	}
	System.out.println(sum);
	if(comp==sum)
		System.out.println("its palindrom ");
	else
		System.out.println("this is not palindrom");

}
}