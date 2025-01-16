package com.practicle.allprogram;

import java.util.Scanner;

public class string_palindrom {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter string ");  //"anil" index satrt from 0,1,2,3
	String string = sc.next();
	String org_value=string;
	String rev="";
	int lenght = string.length();            //4 but index start from 0 so count is 3 only
	sc.close();
	for(int i=lenght-1;i>=0;i--)
	{
		rev=rev+string.charAt(i);//""+l="l"+i="li"+n="lin"+a="lina"
	}
	System.out.println(rev);
	if(org_value.equals(rev))
		System.out.println("its string palindrom");
	else 
		System.out.println("its not string palindrom");
}
}
