package arrays;

public class MergeArray {
	public static void main(String[] args) {
		int a[]={10,20,30,40};
		int b[]={50,60,70};
		int d[]={100,200,300};
		int n=a.length+b.length+d.length;
		System.out.println(n);
		System.out.println("---------------");
		int c[]=new int [n];

		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int j=0;j<b.length;j++) {
			c[j+a.length]=b[j];
		}
		for(int l=0;l<d.length;l++) {
			c[l+a.length+b.length]=d[l];
		}
		for(int k=0;k<c.length;k++) {
			System.out.println(c[k]);
		}
	}

}
