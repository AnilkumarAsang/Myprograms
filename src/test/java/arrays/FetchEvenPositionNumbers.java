package arrays;

public class FetchEvenPositionNumbers {
	public static void main(String[] args) {
		int a[]={13,20,30,40,50,60,70,80,81,87,111};
		int addEvenPosNum=0; int addOddPosNum=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0) {
				System.out.println("Even possition number: " + a[i]);
				addEvenPosNum+=a[i];
				
			}else {
				System.out.println("Odd possition number: " + a[i]);
				addOddPosNum+=a[i];
			}
		}
		System.out.println("Add even pos number: " + addEvenPosNum + " Add odd pos num: " + addOddPosNum);
	}

}
