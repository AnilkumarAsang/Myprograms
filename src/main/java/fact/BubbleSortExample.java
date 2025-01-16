package fact;
public class BubbleSortExample {
    public static void main(String[] args) {
        int[] input = {5, 8, 1, 3, 9, 7, 2, 0};

        System.out.println("Before Sorting:");
        printArray(input);

        bubbleSort(input);

        System.out.println("After Sorting:");
        printArray(input);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;

        // Outer loop for each pass
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // Track if any swap happened
            // Inner loop for comparisons in the current pass
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap the elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true; // Indicate a swap occurred
                }
            }

            // If no swaps happened, array is already sorted
            if (!swapped) break;
        }
    }

    // Utility method to print an array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
