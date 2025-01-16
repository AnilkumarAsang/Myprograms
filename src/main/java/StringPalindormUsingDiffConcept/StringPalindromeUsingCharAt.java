package StringPalindormUsingDiffConcept;

public class StringPalindromeUsingCharAt {
public static void main(String[] args) {
	String input="madamm";
	String empty = "";
	for(int i=0;i<input.length();i++) {
		empty+=input.charAt(i);
	}
	
	if(input.equals(empty)) {
		System.out.println("Its palindrome: " + input);
	}else {
		System.out.println("Its not palindorme: " + input);
	}
}
}
