package arrays;

public class MergeTwoArrays {
	public static void main(String[] args) {
		int []a={10,20,30,40,50,60};
		int []b={70,80,90,100,110,120};
		int lenght=a.length+b.length;
	int al=	a.length;
	int bl=b.length;
	System.out.println(lenght);
	System.out.println("--------");
	System.out.println(al);
	System.out.println("--------");
	System.out.println(bl);
	System.out.println("-----start----");
		int []merge=new int[lenght];//in array syntx we have to mention the lenght of the array with data type
		for(int i=0;i<a.length;i++)
		{
			merge[i]=a[i];
		}
		for(int j=0;j<b.length;j++)
		{
			merge[j+a.length]=b[j];
		}
		for(int k=0;k<merge.length;k++)
		{
			System.out.println(merge[k]);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}