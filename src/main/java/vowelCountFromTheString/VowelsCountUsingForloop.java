package vowelCountFromTheString;

public class VowelsCountUsingForloop {
	    public static void main(String[] args) {
	        String input = "anilkumar asangihal";
	        String vowels = "aeiou";
	        System.out.println("Vowels in the string: ");
	        
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            // Check if the character is a vowel
	            if (vowels.indexOf(ch) != -1) {
	                System.out.print(ch + " ");
	            }
	        }
	    }
	}
