package EachCharactorCountFromTheString;
public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "anilkumar asangihal bijapur ani";

        // Array to store the frequency of characters
        int[] freq = new int[256]; // Covers all ASCII characters

        // Iterate through the characters of the string
        for (char singleTxt : input.toCharArray()) {
            if (singleTxt != ' ') { // Exclude spaces
                freq[singleTxt]++; // Increment the count for the character
            }
        }

        // Print the character frequencies
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) { // Only print characters that appear in the string
                System.out.println((char) i + " " + freq[i]);
            }
        }
    }
}
