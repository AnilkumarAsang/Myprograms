package arrays;

import java.util.Scanner;

public class parshint {
public static void main(String[] args) {
	String n="215";
	int x=Integer.parseInt(n);// <  --same
	int sum=0;
	while(x!=0)
	{
		int rem=x%10;
		sum=(sum*10)+rem;
		x=x/10;
	}
	System.out.println(sum);
}
}
