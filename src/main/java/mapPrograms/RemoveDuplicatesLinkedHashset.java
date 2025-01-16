package mapPrograms;

	import java.util.Arrays;
	import java.util.LinkedHashSet;

	public class RemoveDuplicatesLinkedHashset {
	    public static void main(String[] args) {
	        int[] arr = {10,1, 2,20, 3, 2, 4, 1, 5, 6};

	        // Create a LinkedHashSet to remove duplicates and maintain insertion order
	        LinkedHashSet<Integer> set = new LinkedHashSet<>();
	        for (int num : arr) {
	            set.add(num);
	        }

	        // Convert the LinkedHashSet back to an array
	        int[] uniqueArr = new int[set.size()];
	        int i = 0;
	        for (int num : set) {
	            uniqueArr[i++] = num;
	        }

	        // Print the result
	        System.out.println(Arrays.toString(uniqueArr));
	    }
	}
