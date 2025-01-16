package bubbleshot;

public class Bubbleshot1 {
	public static void main(String[] args) {
		int[]arr={5,1,7,21,25,3,6,4,8,9,2,10};
		//0  1  2  3 4
//		int size=arr.length-1;
		for(int j=0; j<arr.length-1; j++)
		{
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i]>arr[i+1])
				{
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;

				}
			}	
		}
		for (int k=0;k<=arr.length-1;k++)
		{
			System.out.print(arr[k]+" ");
		}
		
	}
}
