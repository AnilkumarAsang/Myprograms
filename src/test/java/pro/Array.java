package pro;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the arrau size");
		int size=sc.nextInt();
		int a[]=new int[size];
		int k=1;
		//System.out.println("Enter the values "+k);
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the value "+k++);
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int j=0;j<a.length;j++)
		{
			sum=sum+a[j];
		}
		System.out.println(sum);
		
		
	}

}
