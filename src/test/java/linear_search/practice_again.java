package linear_search;

import java.util.Scanner;
//linear search for whether value is present or not in   array
public class practice_again {
	public static void main(String[] args) {

		int arr[]={10,20,50,40,70,60,60};
		//          0 1  2   3  4  5
		//lenght    1 2  3   4  5  6 

		Scanner sc=new Scanner (System.in);
		System.out.println("enter array value ");
		int search = sc.nextInt();
		//int comp=search;
		int count=0;
		int lenght = arr.length;
		for(int i=0;i<lenght;i++)
		{
			if(search==arr[i])
			{
				System.out.println("value is present "+arr[i]);
				count++; break;
			}
		}
		if(count==0)
		{
			System.out.println("value is not present");
		}	
	}
}
