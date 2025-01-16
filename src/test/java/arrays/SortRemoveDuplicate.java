package arrays;

public class SortRemoveDuplicate {
	public static void main(String[] args) {
		int a[]={20,10,90,100,20,60,30,70};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		int b[]=new int[a.length];
		for(int m=0;m<a.length;m++)
		{
			b[m]=a[m];
		}

		int q=0;
		for(int p=0;p<b.length;p++)
		{
			if(a[p]!=a[p+1])
			{
				a[q]=a[p];
				q++;
			}
		}
		a[q]=a[a.length-1];
		for(int l=0;l<=q;l++)
		{
			System.out.println(a[l]);
		}
	}
}
