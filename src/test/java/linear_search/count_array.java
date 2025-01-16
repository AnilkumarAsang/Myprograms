package linear_search;

import java.util.Scanner;

public class count_array {
	public static void main(String[] args) {
		for(int r=1;r<=20;r++){
			int arr[]={40,20,10,50,40,40,60,70,20,20,20,20,20};
			int lenght = arr.length,count=0; int s=1;
			Scanner sc=new Scanner (System.in);
			System.out.println("srno:"+r+" Enter the array value for count checking");
			int num = sc.nextInt();


			for(int i=0;i<lenght;i++)
			{
				if(num==arr[i])
				{
					count++;

				}
			}
			System.out.println(count +" times ");
			if(count==0)
				System.out.println("this value is not present");
			/*else
		System.out.println(count+" times repeted");
			 */






		}
	}
}
