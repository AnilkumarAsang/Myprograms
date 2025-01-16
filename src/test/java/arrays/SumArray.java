  package arrays;

public class SumArray {
	public static void main(String[] args) {
		int a[]={10,20,30,40,50,60};
		int sum=0; 
		int len=a.length;//lenght is 8
		for(int i=0;i<len;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		System.out.println(len);
	}

}
