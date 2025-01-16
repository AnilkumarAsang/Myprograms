package ReverseStringUsingDiffConcept;

public class ReverseString {
	    public static void main(String[] args) {
	        
	        String input = "Anilkumar Asangihal";
	        String str = ""; // Initialize as an empty string
	        
	        for (int i = input.length() - 1; i >= 0; i--) {
	            str += input.charAt(i); // Append characters in reverse order
	        }
	        
	        System.out.println(str); // Print the reversed string
	    }
	}

