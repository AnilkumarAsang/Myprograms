package pro;

public class Array1 {  // addition of even numbers 
	public static void main(String[] args) {
		int a[]= {1,3,5,6,7,9,8,10};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				sum=sum+a[i];
			}	
		}
		System.out.println(sum);
	}
}
