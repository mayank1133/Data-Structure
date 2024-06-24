import java.util.*;

public class AnagramGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Enter the number of words: ");
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        // Create an array to store words
        String[] words = new String[N];
        
        // Input each word and store in the array
        for (int i = 0; i < N; i++) {
            System.out.print("Enter word " + (i + 1) + ": ");
            words[i] = scanner.nextLine();
        }
        
        // Generate a random index
        int randomIndex = random.nextInt(N);
        
        // Display the word at the random index
        String chosenWord = words[randomIndex];
        System.out.println("The word is: " + chosenWord);
        
        // Prompt user to enter an anagram
        System.out.print("Enter an anagram of the displayed word: ");
        String userAnagram = scanner.nextLine();
        
        // Check if user's input is an anagram of the chosen word
        if (isAnagram(chosenWord.toLowerCase(), userAnagram.toLowerCase())) {
            System.out.println("Correct! \"" + userAnagram + "\" is an anagram of \"" + chosenWord + "\".");
        } else {
            System.out.println("Incorrect. \"" + userAnagram + "\" is not an anagram of \"" + chosenWord + "\".");
        }
        
        scanner.close();
    }
    
    public static boolean isAnagram(String word1, String word2) {
        // Remove spaces and convert to lower case
        word1 = word1.replaceAll("\\s", "").toLowerCase();
        word2 = word2.replaceAll("\\s", "").toLowerCase();
        
        // Check if lengths are equal
        if (word1.length() != word2.length()) {
            return false;
        }
        
        // Count characters in both words
        Map<Character, Integer> charCount1 = new HashMap<>();
        Map<Character, Integer> charCount2 = new HashMap<>();
        
        for (char c : word1.toCharArray()) {
            charCount1.put(c, charCount1.getOrDefault(c, 0) + 1);
        }
        
        for (char c : word2.toCharArray()) {
            charCount2.put(c, charCount2.getOrDefault(c, 0) + 1);
        }
        
        // Compare character counts
        return charCount1.equals(charCount2);
    }
}
