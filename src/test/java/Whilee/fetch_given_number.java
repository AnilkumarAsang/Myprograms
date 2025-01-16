package Whilee;

import java.util.Scanner;//revrse the given number

public class fetch_given_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);  //143
		System.out.println("enter the value");
		int num=sc.nextInt();//123
		int rev = 0;
		while(num!=0)
		{
			 rev = num%10;	
			System.out.print(rev);
			num=num/10;
		}


	}
}
