package arrays;

import java.util.Arrays;

public class RemoveDuplicate
{
	public static void main(String[] args)
	{
		int a[]={1,100,120,20,30,40,50,50,60,90,90,100};//array should be sorted 
		int j=0;
		int size=a.length-1; //if it is not in order then use (Arrays.sort)
		Arrays.sort(a);
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[j]=a[i];
				j++;
			}
		}
	     a[j]=a[size];
		for(int k=0;k<=j;k++)
		{
			System.out.println(a[k]);
		}

	}

}