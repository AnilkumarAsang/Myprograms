package EachCharactorCountFromTheString;


	import java.util.HashMap;
	import java.util.Map;

	public class CharCount {
	    public static void main(String[] args) {
	        String input = "Anilkumar Asangihal";
	        
	        // Convert input string to lowercase for case-insensitive counting
	        input = input.toLowerCase();
	        
	        // Create a HashMap to store character counts
	        Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
	        
	        // Loop through each character in the string
	        char[] indinput = input.toCharArray();
	        for (char ch : indinput /*input.toCharArray()*/) {
	            if (ch != ' ') { // Ignore spaces
	                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
	            }
	        }
	        
//	        for(int i =0;i<input.length();i++){ 
//	        	char txt = input.charAt(i);
//	        	 if (txt != ' ') { // Ignore spaces
//		                charCountMap.put(txt, charCountMap.getOrDefault(txt, 0) + 1);
//		            }
//	        	
//	        }
	        
	        // Print the character counts
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }
	}

