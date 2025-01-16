package vowelCountFromTheString;

import java.util.LinkedHashSet;

public class VowelCountWithTotalAndUnique {

    public static void main(String[] args) {

        String inputTocheckVowels = "anilkumar asangihal";
        String vowels = "aeiou";
        int totalVowelCount = 0;

        // Use LinkedHashSet to maintain insertion order of unique vowels
        LinkedHashSet<Character> uniqueVowels = new LinkedHashSet<>();

        // Loop through each character in the input string
        for (char indiChar : inputTocheckVowels.toCharArray()) {
            // Check if the character is a vowel
            if (vowels.indexOf(indiChar) != -1) {
                totalVowelCount++; // Count all vowels (including duplicates)
                uniqueVowels.add(indiChar); // Add unique vowels to the set
            }
        }

        // Print unique vowels and total vowel count
        System.out.println("Unique vowels in the string: " + uniqueVowels);
        System.out.println("Total number of vowels: " + totalVowelCount);
    }
}
