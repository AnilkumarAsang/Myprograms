package Whilee;

import java.util.Scanner;

public class count_evenNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the value");
	int num=sc.nextInt();//1234
	int count=0,count1=0;
	while(num!=0)
	{
		int a=num%10;//4,3,2,1
		if(a%2==0)//4
		{
			count++;//1,2
			count1=count1+a;//0+4=4,6
		}
			num=num/10;//123,12,1
		}
	System.out.println("count of even numbers only: "+ count);
	System.out.println("sum of even numbers onnly: "+ count1);
	}
	
}
/*OUTPUT:-count of even numbers only: 2    
sum of even numbers onnly: 6
*/