package mapPrograms;
import java.util.Arrays;

public class SeparateDuplicateAndUniqueValues {
    public static void main(String[] args) {
        int[] arr = {100, 10, 20, 40, 30, 100, 40, 70, 40, 120, 108, 107};

        // Sort the array first
        Arrays.sort(arr);

        // Arrays to store unique elements and duplicates
        int[] duplicates = new int[arr.length]; 
        int[] uniqueArr = new int[arr.length];

        int k = 0, dupIndex = 0;

        // Process the sorted array to separate duplicates
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] != arr[j + 1]) {
                uniqueArr[k++] = arr[j];
            } else {
                // Store the duplicate value
                duplicates[dupIndex++] = arr[j];
            }
        }
        
        // Add the last element (it has no next element to compare)
        uniqueArr[k++] = arr[arr.length - 1];

        // Printing unique values (after removing duplicates)
        System.out.println("Unique values: ");
        for (int i = 0; i < k; i++) {
            System.out.print(uniqueArr[i] + " ");
        }
        System.out.println();

        // Printing duplicate values
        System.out.println("Duplicate values: ");
        for (int i = 0; i < dupIndex; i++) {
            System.out.print(duplicates[i] + " ");
        }
    }
}
