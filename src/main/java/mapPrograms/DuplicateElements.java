package mapPrograms;
import java.util.HashMap;
import java.util.Map;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1, 6, 1};
        Map<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();
        
        int sum=0;
        for (int num : arr) {
        	sum+=num;
            elementCountMap.put(num, elementCountMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("sum: " + sum);
        System.out.println("Duplicate elements and their counts:");
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
