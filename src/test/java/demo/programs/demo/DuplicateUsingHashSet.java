package demo.programs.demo;

import java.util.LinkedHashSet;

public class DuplicateUsingHashSet {
	public static void main(String[] args) {
		String s[]={"ramesh","dilip","naveen","suresh","dilip"};
		LinkedHashSet h=new LinkedHashSet();
		boolean flag=false;
		for(String s1:s)
		{
			if(h.add(s1)==false)
			{
				System.out.println("Duplicate found "+s1);
				flag=true;
				
			}
			
		}
		if(flag==false)
		{
			System.out.println("Duplicate not found");
		}
	}

}
