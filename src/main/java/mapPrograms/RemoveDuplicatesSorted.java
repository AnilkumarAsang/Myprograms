package mapPrograms;
import java.util.Arrays;
import java.util.TreeSet;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class RemoveDuplicatesSorted {
    public static void main(String[] args) {
        int[] arr = {10, 1, 2, 20,20, 3, 2, 4, 1, 5, 6};

        // Create a TreeSet to remove duplicates and automatically sort the elements
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : arr) {
            set.add(num);  // TreeSet automatically removes duplicates and sorts the elements
        }
        System.out.println("sort and remove the dup: " + set);
        // Convert the TreeSet back to an array
//        int[] uniqueArr = new int[set.size()];
//        int i = 0;
//        for (int num : set) {
//            uniqueArr[i++] = num;  // Populate the unique array with sorted set elements
//        }
//
//        // Print the result
//        System.out.println(Arrays.toString(uniqueArr));  // Output unique elements in sorted order
    }
}
