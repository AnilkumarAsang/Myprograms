package StringPalindormUsingDiffConcept;

	import java.util.Stack;

	public class StringPalindromeUsingStactWithEqualsMethod {
	    public static void main(String[] args) {
	        String input = "madam";
	        if (isPalindrome(input)) {
	            System.out.println("Yes, it's a palindrome: " + input);
	        } else {
	            System.out.println("It's not a palindrome: " + input);
	        }
	    }

	    private static boolean isPalindrome(String input) {
	        Stack<Character> stack = new Stack<Character>();
//	        char[] cc = input.toCharArray()
	        // Push all characters onto the stack
	        for (char cc1 : input.toCharArray()) {
	            stack.push(cc1);
	        }
//	        for(int i=0;i<input.length();i++) {
//	        	stack.push(input.charAt(i));
//	        }

	        // Build the reversed string using the stack
	        StringBuilder reversed = new StringBuilder();
	        while (!stack.isEmpty()) {
	            reversed.append(stack.pop());
	        }
//	   OR     String reversed1= new StringBuilder(input).reverse().toString();

//	OR        StringBuilder stringBuilder = new StringBuilder(input);
//	        		stringBuilder.reverse().toString();
	        
//	        reversed1.equals(input);

	        // Compare the original string with the reversed string
	        return input.equals(reversed.toString());
	    }
	}

