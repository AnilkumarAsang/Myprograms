package mapPrograms;
import java.util.Map;
import java.util.TreeMap;
//Sort a Map by Keys
public class SortMapByKey {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<Integer, String>();
        map.put(3, "Banana");
        map.put(1, "Apple");
        map.put(4, "Mango");
        map.put(2, "Cherry");

        System.out.println("Sorted Map by keys:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
