package linear_search;

import java.util.Scanner;

public class removeWhiteSpace {
public static void main(String[] args) {
	String str="anil Kuma r12 3";
	System.out.println("lenght "+str.length());
	 str=str.replaceAll(" ","");
	System.out.println(str);
}
}





/*	for(int i=0;i<str.length();i++)
{
if((str.charAt(i)>=65 && str.charAt(i)<=90) ||(str.charAt(i)>=97 && str.charAt(i)<=122)||(str.charAt(i)>=48 && str.charAt(i)<=57))
	{
		//System.out.print(str.charAt(i));
	}
}
System.out.println();
*/