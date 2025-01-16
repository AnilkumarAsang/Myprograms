//package mapPrograms;
//import java.util.*;
//import java.util.Map.Entry;
//
//public class SortMapByValue {
//    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<String, Integer>();
//        map.put("Apple", 3);
//        map.put("Banana", 1);
//        map.put("Cherry", 4);
//        map.put("Mango", 2);
//
//        List<Map.Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(map.entrySet());
//        list.sort(Map.Entry.comparingByValue());
//
//        System.out.println("Sorted Map by values:");
//        for (Map.Entry<String, Integer> entry : list) {
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
//        }
//    }
//}
