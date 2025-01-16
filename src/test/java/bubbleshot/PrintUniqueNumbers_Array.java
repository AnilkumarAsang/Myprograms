package bubbleshot;

import java.util.Arrays;

public class PrintUniqueNumbers_Array {
public static void main(String[] args) {
	int a []={10,20,30,20,40,50,60,50,10};
	int j=0;
	Arrays.sort(a);
int count=0; int count1=0;
System.out.println("total lenth: "+a.length);
	for(int i=0;i<a.length-1;i++)
	{
		
		if(a[i]!=a[i+1])
		{
			a[j]=a[i];
			j++;
			count++;
			
		}
		if(a[i]==a[i+1])
		{
			count1++;
		}
	}
	
	System.out.println("duplicate elements : "+count1);
	System.out.println("unique elements: "+(count+1));
	//a[j]=a[a.length-1];
	//System.out.println("lenth: "+a.length);
	for(int k=0;k<=j;k++)
	{
		System.out.println(a[k]);
	}
}
}
