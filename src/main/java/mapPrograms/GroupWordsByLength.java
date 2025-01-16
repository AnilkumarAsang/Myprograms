//package mapPrograms;
//import java.util.*;
//import java.util.function.BiFunction;
//
//public class GroupWordsByLength {
//    public static void main(String[] args) {
//        String[] words = {"cat", "dog", "elephant", "tiger", "lion", "ant"};
//        Map<Integer, List<String>> groupedWords = new HashMap<>();
//
//        for (String word : words) {
//            int length = word.length();
//            groupedWords.computeIfPresent(length, (BiFunction<? super Integer, ? super List<String>, ? extends List<String>>) new ArrayList<>());
//            groupedWords.get(length).add(word);
//        }
//
//        System.out.println("Words grouped by their lengths:");
//        for (Map.Entry<Integer, List<String>> entry : groupedWords.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//    }
//}
