package pro;
import java.util.Arrays;
public class BinarySearch {
	public static void main(String[] args) {
		int a[]= {10,2,7,4,1,5,6,8,9,3};
		int l=0,h=a.length-1,key=8;
	int flag=0;
	Arrays.sort(a);
//	for(int i=0;i<a.length;i++) {
//		System.out.println(a[i]);
//	}
//	
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(a[mid]==key)
			{
				System.out.println("number found ");
				flag=1;
				break;
			}  
			else if(a[mid]>key)
			{
				h=mid-1;
			}
			if(a[mid]<key)
			{
				l=mid+1;
			}
		}
		if(flag==0)
			System.out.println("Number not found");
	}
}
