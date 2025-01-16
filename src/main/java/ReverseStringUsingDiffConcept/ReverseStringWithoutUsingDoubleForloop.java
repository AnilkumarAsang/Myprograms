package ReverseStringUsingDiffConcept;

public class ReverseStringWithoutUsingDoubleForloop {

	    public static void main(String[] args) {
	        
	        String input = "Anilkumar Asangihal";
	        String[] words = input.split(" "); // Split the string into words
	        String result = "";
	        
	        
	        for (int j = 0; j < words.length; j++) {
	        	
	            String reversedWord = "";
	            for (int i = words[j].length() - 1; i >= 0; i--) {
	                reversedWord += words[j].charAt(i); // Use charAt to access characters Anilkumar
	            }
	            result += reversedWord + " "; // Append reversed word to result
	        }
	        
	        // Remove the trailing space and print the result
	        System.out.println(result.trim());
	    }
	}

