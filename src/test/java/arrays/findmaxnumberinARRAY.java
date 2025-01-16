package arrays;

public class findmaxnumberinARRAY {
public static void main(String[] args) {
	int [] arr={1,50,40,2,030,70};
	int max=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	System.out.println("maximum value in arrays is: "+max);
}
}
