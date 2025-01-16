package StringPalindormUsingDiffConcept;

public class StringPalindromeUsingStartAndEndPoint {

	public static void main(String []args) {
		
		String input="maaadaaam";
		System.out.println("*************");
		if(ispalindrome(input)) {
			System.out.println("its a palindrom: " + input);
		}else {
			System.out.println("Its not a palindrome: " + input);
		}
	}
	
	public static boolean ispalindrome(String str) {
		System.out.println("-************--------");
		int start=0;
		int end=str.length()-1;
		
		while(start<end) {
			System.out.println("//////////////" + start +" " + end);
			if(str.charAt(start)!=str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		
		return true;
	}
	
}
