package recursion_method;

import java.util.Scanner;

public class Factorial_using_recursion 
{	
void number(int no)
{
int fact=1;// according to thumb rule multi=1 and sum=0   5!=5*4*3*2*1=120
for(int i=no; i>=1; i--)
{
fact=fact*i;	
}
System.out.println(fact);
}
public static void main(String[] args)
{	
	Factorial_using_recursion f=new Factorial_using_recursion();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the factorial value");
	f.number(sc.nextInt());
	
	
	
}
}
