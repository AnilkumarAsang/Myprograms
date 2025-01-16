package mapPrograms;

	public class RemoveDuplicatesWithoutMap {
	    public static void main(String[] args) {
	        int[] arr = {10,1,10, 2, 3, 2, 4, 1, 5, 6};
	        
	        // Create a new array to store unique elements
	        int[] tempArr = new int[arr.length];
	        int uniqueCount = 0;

	        // Loop through each element in the original array
	        for (int i = 0; i < arr.length; i++) {
	            boolean isDuplicate = false;

	            // Check if the element is already in the tempArr (the result array)
	            for (int j = 0; j < uniqueCount; j++) {
	                if (arr[i] == tempArr[j]) {
	                    isDuplicate = true; // Set flag if element is duplicate
	                    break;
	                }
	            }

	            // If it's not a duplicate, add it to the tempArr
	            if (!isDuplicate) {
	                tempArr[uniqueCount++] = arr[i];
	            }
	        }

	        // Print the unique elements
	        System.out.print("Unique elements: ");
	        for (int i = 0; i < uniqueCount; i++) {
	            System.out.print(tempArr[i] + " ");
	        }
	    }
	}
