package recursion_method;

import java.util.Scanner;

public class Factorial123 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int n=sc.nextInt();
	int num=fact(n);
		System.out.println(num);
	}
	static  int fact1=1;
	static int fact(int n1)
	{
	  if(n1!=0) 
	  {
		  fact1=fact1*n1;//120
		  n1--;
		  fact(n1);
	  }
	 // System.out.println(fact1);
	  return fact1;
	}

}
