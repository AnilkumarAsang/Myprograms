package StringPalindormUsingDiffConcept;

	import org.apache.commons.lang3.StringUtils;

	public class StringPalindromUsingStringUtils {
	    public static void main(String[] args) {
	        String str = "madam"; 
	        if (isPalindrome(str)) {
	            System.out.println(str + " is a palindrome.");
	        } else {
	            System.out.println(str + " is not a palindrome.");
	        }
	    }

	    public static boolean isPalindrome(String str) {
//	    	String var = StringUtils.reverse(str);
//	    	return	StringUtils.equals(str, var);
	        return StringUtils.equals(str, StringUtils.reverse(str)); // Compare original string with reversed string
	    }
	}

