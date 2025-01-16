package ReverseStringUsingDiffConcept;

public class ReverseStringWithSamePossitionUsingStringBuilder {
	    public static void main(String[] args) {
	        
	        String input = "Anilkumar Asangihal";
	        String[] words = input.split(" "); // Split the string into words
	        StringBuilder result = new StringBuilder();
	        
	        for (String word : words) {
	            // Reverse each word
	            String reversedWord = new StringBuilder(word).reverse().toString();
	            result.append(reversedWord).append(" "); // Append reversed word to result
	        }
	        
	        // Remove the trailing space and print the result
	        System.out.println(result.toString().trim());
	    }

}
