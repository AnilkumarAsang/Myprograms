package EachCharactorCountFromTheString;
import java.util.HashMap;
import java.util.Map;
public class GetTheEachCharCount {
	

	    public static void main(String[] args) {
	        String input = "anilkumar asangihal bijapur";
	        
	        Map<Character, Integer> map = new HashMap<Character, Integer>();

	        // Iterate through the characters of the string
	        for (char singleTxt : input.toCharArray()) {
	            if (singleTxt != ' ') { // Exclude spaces
	                // Check if the character is already in the map
	                if (map.containsKey(singleTxt)) {
	                    // If it exists, increment its count
	                    int currentCount = map.get(singleTxt);
	                    map.put(singleTxt, currentCount + 1);
	                } else {
	                    // If it doesn't exist, initialize its count to 1
	                    map.put(singleTxt, 1);
	                }
	            }
	        }

	        // Print the character counts
	        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + " " + entry.getValue());
	        }
	    }
	}

