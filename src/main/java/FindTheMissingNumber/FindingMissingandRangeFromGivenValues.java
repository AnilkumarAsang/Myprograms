package FindTheMissingNumber;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindingMissingandRangeFromGivenValues {
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
System.out.println("values: " + numberSet);
        // Create lists for the full range and missing numbers
        List<Integer> allNumbersInRange = new ArrayList<>();
        List<Integer> missingNumbers = new ArrayList<>();

        // Loop through the range and add all numbers, identifying missing ones
        for (int i = lowerBound; i <= upperBound; i++) {
            allNumbersInRange.add(i);  // Add all numbers in the range
            if (!numberSet.contains(i)) {
                missingNumbers.add(i);  // Add missing numbers to a separate list
            }
        }

        // Print the full range and missing numbers
        System.out.println("Range: " + lowerBound + " to " + upperBound);
        System.out.print("All numbers in range: ");
        System.out.println(allNumbersInRange);  // Print all numbers from 2 to 7
        
        System.out.print("Missing numbers: ");
        System.out.println(missingNumbers);  // Print missing numbers
    }
}
