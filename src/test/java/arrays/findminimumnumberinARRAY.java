package arrays;

public class findminimumnumberinARRAY {
public static void main(String[] args) {
	int [] arr={10,1,50,20,40,60};
	int min=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]<min)
		{
		min=arr[i];	
		}
	}
	System.out.println("minimum value in array is: "+min);
}
}
