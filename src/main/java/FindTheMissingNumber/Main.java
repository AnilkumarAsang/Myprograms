package FindTheMissingNumber;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Input list and range
        int[] list = {5, 8, 1, 3, 9, 7, 2, 0};
        int lowerBound = 2;
        int upperBound = 7;

        // Create a list for the range
        List<Integer> rangeList = new ArrayList<>();
        for (int i = lowerBound; i <= upperBound; i++) {
            rangeList.add(i);
        }

        // Check for missing numbers
        List<Integer> missingNumbers = new ArrayList<>();
        for (int num : rangeList) {
            boolean isPresent = false;
            for (int value : list) {
                if (value == num) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) {
                missingNumbers.add(num);
            }
        }

        // Output the results
        System.out.println("Range: " + lowerBound + " to " + upperBound);
        System.out.println("Missing Numbers: " + missingNumbers);
    }
}
