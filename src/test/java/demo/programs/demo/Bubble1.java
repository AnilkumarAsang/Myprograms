package demo.programs.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Bubble1 {
	public static void main(String[] args) {
		int [] a={9,5,6,7,1,0,1,5};
		//String a[]={"5","3","9","2","8","1"};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int k=0;k<=a.length-1;k++)
		{
			System.out.println(a[k]);
		}

		/*ArrayList<String> a2 = new ArrayList<>(Arrays.asList(a));

		a2.stream().sorted().forEach(s->System.out.println(s));
		System.out.println("------------");

		Arrays.stream(b).distinct().sorted().forEach(d->System.out.println(d));
		 */

	}
}