package ReverseStringUsingDiffConcept;

public class ReverseStringButSamePossitionUsingToCharArrayAndLoop {
	    public static void main(String[] args) {
	        
	        String input = "Anilkumar Asangihal";
	        String[] words = input.split(" "); // Split the string into words
	        String result = "";
	        
			for(int j=0;j<words.length ;j++) {
				char[] wordArray=words[j].toCharArray();
//	        }
//	        for (String word : words) {
//	        	
//	            // Reverse each word without StringBuilder
//	            char[] wordArray = word.toCharArray(); // Convert word to char array
	            String reversedWord = "";
	            for (int i = wordArray.length - 1; i >= 0; i--) {
	                reversedWord += wordArray[i]; // Append each character in reverse order
	            }
	            result += reversedWord + " "; // Append reversed word to result
	        }
	        
	        // Remove the trailing space and print the result
	        System.out.println(result.trim());
	    }
	}
