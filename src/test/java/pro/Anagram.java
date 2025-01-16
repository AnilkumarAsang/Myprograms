package pro;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s="ate";
		String s1="eat";
		char c1[]=s.toCharArray();
		char c2[]=s1.toCharArray(); 
		Arrays.sort(c1);
		Arrays.sort(c2);
		
	String s3=	new String (c1);
	String s4=	new String (c2);
	
//	String s5=c1.toString();
//	System.out.println(s5);
//	System.out.println(s3);
//	System.out.println(s4);
	if(s3.equals(s4))
		System.out.println("Anagram");
	else
		System.out.println("Not a anagram");
			}

}
