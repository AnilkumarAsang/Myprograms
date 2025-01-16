package vowelCountFromTheString;

import java.util.ArrayList;

public class VowelCountWithTotalAndUniqueUsingArrayList {

    public static void main(String[] args) {

        String inputTocheckVowels = "anilkumar asangihal";
        String vowels = "aeiou";
        int totalVowelCount = 0;

        // ArrayList to store unique vowels
        ArrayList<Character> uniqueVowels = new ArrayList<>();

        // Loop through each character in the input string
        for (char indiChar : inputTocheckVowels.toCharArray()) {
            // Check if the character is a vowel
            if (vowels.indexOf(indiChar) != -1) {
                totalVowelCount++; // Count all vowels (including duplicates)

                // Add the vowel to the list if it is not already present
                if (!uniqueVowels.contains(indiChar)) {
                    uniqueVowels.add(indiChar);
                }
            }
        }

        // Print unique vowels and total vowel count
        System.out.println("Unique vowels in the string: " + uniqueVowels);
        System.out.println("Total number of vowels: " + totalVowelCount);
    }
}
