package arrays;

public class mergerthreearrays {
public static void main(String[] args) {
	int [] a={10,20,30,40};
	int [] b={50,60,70};
	int [] c={80,90,100,110};
	int [] d={120,130,140};
	int size=a.length+b.length+c.length+d.length;
	int [] store=new int [size];
	for(int i=0;i<a.length;i++)
	{
		store[i]=a[i];
	}
	for(int j=0;j<b.length;j++)
	{
		store[j+a.length]=b[j];
	}
	for(int k=0;k<c.length;k++)
	{
		store[k+a.length+b.length]=c[k];
	}
	for(int l=0;l<d.length;l++)
	{
		store[l+a.length+b.length+c.length]=d[l];
	}
	for(int m=0;m<store.length;m++)
	{
		System.out.println(store[m]);
	}
}
}
