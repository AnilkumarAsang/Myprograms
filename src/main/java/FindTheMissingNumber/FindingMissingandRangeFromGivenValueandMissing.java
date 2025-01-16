package FindTheMissingNumber;

	import java.util.ArrayList;
import java.util.Arrays;
	import java.util.HashSet;
import java.util.List;
import java.util.Set;

	public class FindingMissingandRangeFromGivenValueandMissing {
	    public static void main(String[] args) {
	        // Input list and range
	        int[] list = {5, 8, 1, 3, 9, 7, 2, 0};
	        int lowerBound = 2;
	        int upperBound = 7;

	        // Convert the list to a Set for quick lookup
	        Set<Integer> numberSet = new HashSet<>();
	        for (int num : list) {
	            numberSet.add(num);
	        }

	        // Print the range with missing numbers indicated
	        System.out.println("Range: " + lowerBound + " to " + upperBound);
	        System.out.println("Numbers in range (with missing indication):");
	       List<Integer> array = new ArrayList<Integer>();
	       List<Integer> array1 = new ArrayList<Integer>();
	        for (int i = 0; i <= list.length; i++) {
	            if (numberSet.contains(i)) {
	            	array.add(i);
//	                System.out.print(i + " ");
	            } else {
//	                System.out.print(i + " ");
	                array1.add(i);
	            }
	        }
	        System.out.println("All number with missing number and in order and its range from 2 to 7 : " + array);
	        System.out.println("Missing number  : " + array1);
//	        array.addAll(array1);
//	        System.out.println(array);
	        
	    }
	}

