// A book editor tool requires a function to find the longest word in a given sentence.
// Note: You are supposed to use at least two classes and one object in your program.

import java.util.Scanner;
class LongestWordFinder {
    public String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}

public class ass8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();

        LongestWordFinder finder = new LongestWordFinder();
        String longestWord = finder.findLongestWord(userInput);

        System.out.println("The longest word in the sentence is: " + longestWord);

        scanner.close();
    }
}
// done