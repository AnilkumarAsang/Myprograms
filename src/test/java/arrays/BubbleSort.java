package arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {30, 20, 60, 90, 10, 50};

        System.out.println("Array before sorting:");
        for (int s : a) {
            System.out.print(s + " ");
        }
//        System.out.println();
//        Arrays.sort(a);
//        System.out.println(Arrays.toString(a) + " values");
       System.out.println(); 

        System.out.println("----Using Bubble Sort Method-----");

        // Bubble sort implementation  30, 20, 60, 90, 10, 50
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) { // Reduce unnecessary comparisons
                if (a[j] > a[j + 1]) {
                    // Swap elements
                    int temp = a[j];  //20,30,60,90,10,50  20,30,60,10,90,50   20,30,60,10,50,90
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    
                }
            }
           
            
        }

        System.out.println("Array after sorting:");
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
    }
}
