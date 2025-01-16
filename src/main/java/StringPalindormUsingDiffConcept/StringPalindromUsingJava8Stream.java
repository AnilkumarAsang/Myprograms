package StringPalindormUsingDiffConcept;

public class StringPalindromUsingJava8Stream {

	public static void main(String[]args) {
		String string="madam";
		if(isPalindrome(string)) {
			System.out.println("Yes its palindome");
		}else {
			System.out.println("Its not palindrome");
		}
		
		}

	 static boolean isPalindrome(String input) {
		 StringBuilder str=new StringBuilder(input);
	      return str.reverse().toString().equals(input);
	
	}

		
	}