// A company is developing a new security system that requires checking whether a given string has all unique
// characters. You need to write a program that:
// 1. Accepts a string input from the user.
// 2. Checks if all characters in the string are unique.
// Note: You are supposed to use at least two classes and one object in your program.

import java.util.HashSet;
import java.util.Scanner;
class UniqueCharacterChecker {
    public boolean hasAllUniqueCharacters(String input) {
        HashSet<Character> charSet = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (charSet.contains(c)) {
                return false; // Duplicate character found
            }
            charSet.add(c);
        }
        return true; // All characters are unique
    }
}

public class ass7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        UniqueCharacterChecker checker = new UniqueCharacterChecker();
        boolean result = checker.hasAllUniqueCharacters(userInput);

        if (result) {
            System.out.println("All characters in this string are unique.");
        } else {
            System.out.println("This string contains duplicate characters.");
        }

        scanner.close();
    }
}
// done