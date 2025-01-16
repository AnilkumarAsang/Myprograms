package arrays;

import java.util.ArrayList;

public class FetchEvenNumbers {
	public static void main(String[] args) {
		int a[]={10,21,30,45,55,90,100,101};
//		int evensum=0;
//		int oddSum =0;
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]%2==0)
//			{
//				System.out.println("even number: "+a[i]);
//				evensum +=a[i];
//			}
//			else
//			{
//				System.out.println("odd numbers: "+a[i]);
//				oddSum+=a[i];
//			}
//		}
			ArrayList<Integer> evenNumbers=new ArrayList<Integer>();
			ArrayList<Integer> oddNumbers=new ArrayList<Integer>();
			int evenSum=0;
			int oddSum=0;
			for(int num:a) {
				if(num%2==0) {
//					System.out.print("Even number: " + num + " ");
					evenNumbers.add(num);
					evenSum+=num;
					
				}else {
					oddNumbers.add(num);
					oddSum+=num;
//					System.out.print("Odd number: " + num + " " );
				}
				
			}
		System.out.println("Even: " + evenNumbers + " " + " odd: " + oddNumbers);
		System.out.println("Even sum: " + evenSum + " Odd sum: " + oddSum);
	}

}
