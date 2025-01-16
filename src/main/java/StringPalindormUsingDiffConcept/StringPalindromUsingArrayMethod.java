package StringPalindormUsingDiffConcept;

import java.util.Arrays;

public class StringPalindromUsingArrayMethod {
	public static void main(String[] args) {
		String input="madam";
		if(isPalindrome(input)) {
			System.out.println("Yes its palindrome: " + input);
		}else {
			System.out.println("Its not palindrome: " + input);
		}
	}

	private static boolean isPalindrome(String input) {
		char [] actualarray = input.toCharArray(); //m a d a m
		char [] reversedarray=new char[actualarray.length];
		int lengthOfArray = actualarray.length-1;
		for(int i=0;i<actualarray.length;i++) {
//			char srfg = actualarray[i];
			if(actualarray[i]!=actualarray[actualarray.length-1-i]) {
				return false;
			
			
		}
			
			reversedarray[i]=actualarray[actualarray.length-1-i];
		}
		
//		for(int i=0;i<actualarray.length;i++) {
//			if(actualarray[i]!=reversedarray[i]) {
//				return false;
//			}
//		}
		
//		return Arrays.equals(actualarray, reversedarray);
		return true;
	}
	

}
