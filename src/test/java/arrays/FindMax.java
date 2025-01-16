package arrays;

public class FindMax {
	public static void main(String[] args) {
		int a[]={30,20,60,90,100,500};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
