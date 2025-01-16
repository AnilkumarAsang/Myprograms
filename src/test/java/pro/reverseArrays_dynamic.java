package pro;

import java.util.Scanner;

public class reverseArrays_dynamic {
public static void main(String[] args) throws InterruptedException{
	int n=0,j=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no of element in the array");
	int num1=sc.nextInt();
	int []arr=new int[num1];
	int []arr1=new int[num1];
	System.out.println("Enter the elements in to the array ");
	
	for(int i=0;i<num1;i++)
	{
		
	arr[i]=	sc.nextInt();
	System.out.println("Enter the elements in to the array "+n++);
	}
	System.out.println("print it in reverse");
	


		
		for(int i=num1;i>0;i--,j++)
		{
			arr1[j]=arr[i-1];
			System.out.println(arr1[j]);
		}
	}
}
