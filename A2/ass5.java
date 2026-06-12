// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// Note: You are supposed to use at least two classes and one object in your program.

import java.util.Arrays;
import java.util.Scanner;
class AnagramChecker {
    public boolean areAnagrams(String s, String t) {
        // Remove whitespace and convert to lowercase
        s = s.replaceAll("\\s", "").toLowerCase();
        t = t.replaceAll("\\s", "").toLowerCase();

        // Convert strings to char arrays and sort them
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Check if sorted arrays are equal
        return Arrays.equals(sArray, tArray);
    }
}

public class ass5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String t = scanner.nextLine();

        AnagramChecker checker = new AnagramChecker();
        boolean result = checker.areAnagrams(s, t);

        if (result) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        scanner.close();
    }
}
// done