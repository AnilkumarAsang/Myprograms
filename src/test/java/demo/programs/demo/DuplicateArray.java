package demo.programs.demo;

public class DuplicateArray {
	public static void main(String[] args) {
	   String s[]={"ramesh","suresh","dilip","shashi","ramesh","ramesh"};
	   int count=0;
	   for(int i=0;i<s.length-1;i++)
	   {
		   for( int j=i+1;j<s.length;j++)
		   {
			   if(s[i]==s[j])
			   {
				   System.out.println("Duplicate found: "+s[i]);
				   count++;
			   }
			   
		   }
	   }
	   System.out.println(count);
	   if(count==0)
	   {
		   System.out.println("not found");
	   }
	}

}
