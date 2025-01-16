package mapPrograms;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2, 2, 3, 2, 4, 1, 5, 6};

        // Create a HashSet from the array to remove duplicates
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        // Convert the HashSet back to an array
        int[] uniqueArr = new int[set.size()];
        int i = 0;
        for (int num : set) {
            uniqueArr[i++] = num;
        }

        // Print the result
        System.out.println(Arrays.toString(uniqueArr));
    }
}
