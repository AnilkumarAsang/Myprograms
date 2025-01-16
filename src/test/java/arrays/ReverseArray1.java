package arrays;

public class ReverseArray1 {
	public static void main(String[] args) {
		int a[]={100,20,30,40,50,60,70,80,120};
		int j=0;
		int b[]=new int[a.length];
		
		for(int c:a)
		{
			System.out.println(c);
		}
		System.out.println("------");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		System.out.println("------------");
//		for(int i=a.length-1;i>=0;i--)
//		{
//			b[j]=a[i];
//			j++;
//		}
//		
//		for(int k=0;k>j;k++)
//		{
//			System.out.println(b[k]);
//		}


	}

}
