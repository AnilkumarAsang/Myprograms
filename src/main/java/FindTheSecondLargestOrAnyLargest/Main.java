package FindTheSecondLargestOrAnyLargest;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
//        int[] arr = {1, 2, 3, 4, 5, 6};

        // Sort the array in ascending order
        Arrays.sort(arr);

        // The second largest element will be the second last element after sorting
        int secondLargest = arr[arr.length - 4];
        System.out.println(secondLargest);
//
//        for (int num : arr) {
//            if (num > first) {
//                second = first;
//                first = num;
//            } else if (num > second && num < first) {
//                second = num;
//            }
//        }
//
//        System.out.println("Second largest number: " + second);
    }
}
