package linear_search;

import java.util.Scanner;

public class p_count_linear {
public static void main(String[] args) {
	int []arr={10,20,30,40,50,60,10,20};
	int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enetr the number");
	int num=sc.nextInt();
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==num)
		{
			count++;
		}
	}
	if(count>0)
	{
		System.out.println("element is present: "+num+"  \n"+"counts "+count);
	}
	else
		System.out.println("the element is not present: "+num);
}
}
