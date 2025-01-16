package pageObects;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the input value: ");
	int fact = sc.nextInt();
	
	int fact1=1;
	 for(int i=fact;i>=1;i--) {
		 fact1=fact1*i;
		 
	 }
	 System.out.println("Fact: " + fact1);
}
}
