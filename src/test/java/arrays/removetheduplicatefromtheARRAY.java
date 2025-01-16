package arrays;

import java.util.Arrays;

public class removetheduplicatefromtheARRAY {
public static void main(String[] args) {
	int [] arr={100,10,20,40,30,100,40,70,40,120,108,107};
	Arrays.sort(arr);

	int size=arr.length-1;
	int k=0;
		for(int j=0;j<arr.length-1;j++)
		{
			if(arr[j]!=arr[j+1])
			{
			arr[k]	=arr[j];
			k++;
			}
		}
		arr[k]=arr[size];
		for(int s=0;s<=k;s++)
		{
			System.out.println(arr[s]);
		}
	}
}

