package demo.programs.demo;
public class BubbleSort {
	public static void main(String[] args) {
		int a[]={6,3,9,2,1,2};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1]){
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
				}
		}
		
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
	}

}
