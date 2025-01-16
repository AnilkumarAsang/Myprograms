package pro;

public class LinearSearch {
	public static void main(String[] args) {
		int a[]= {2,5,1,7,8,3};
		int num=10,flag=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				System.out.println("number is found at "+i);
				flag=1;
			}
			
		}
		if(flag==0)
			System.out.println("number not found");
	}

}
