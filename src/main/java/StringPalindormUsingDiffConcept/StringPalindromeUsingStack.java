package StringPalindormUsingDiffConcept;

	import java.util.Stack;

	public class StringPalindromeUsingStack {
	    public static void main(String[] args) {
	        String str = "madam"; // Example string
	        if (isPalindrome(str)) {
	            System.out.println(str + " is a palindrome.");
	        } else {
	            System.out.println(str + " is not a palindrome.");
	        }
	    }

	    public static boolean isPalindrome(String str) {
	        Stack<Character> stack = new Stack<Character>();
	        
	        // Push each character of the string into the stack
	        for (int i = 0; i < str.length(); i++) {
	            stack.push(str.charAt(i));
	        }

	        // Compare each character of the string with the stack's top
	        for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) != stack.pop()) {
	                return false; // If characters don't match, it's not a palindrome
	            }
	        }
	        return true; // It's a palindrome if all characters matched
	    }
	}

