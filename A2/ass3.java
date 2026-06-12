// Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number 
// could represent. Return the answer in any order.
// A mapping of digit to letters (just like on the telephone buttons) is given below. 
// Note that 1 does not map to any letters.
// Note: You are supposed to use at least two classes and one object in your program.

import java.util.ArrayList;
import java.util.List;
class LetterCombinations {
    private static final String[] KEYPAD = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public List<String> getCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return combinations;
        }
        backtrack(combinations, new StringBuilder(), digits, 0);
        return combinations;
    }

    private void backtrack(List<String> combinations, StringBuilder current, String digits, int index) {
        if (index == digits.length()) {
            combinations.add(current.toString());
            return;
        }
        
        String letters = KEYPAD[digits.charAt(index) - '0'];
        for (char letter : letters.toCharArray()) {
            current.append(letter);
            backtrack(combinations, current, digits, index + 1);
            current.deleteCharAt(current.length() - 1); // backtrack
        }
    }
}

public class ass3 {
    public static void main(String[] args) {
        LetterCombinations lc = new LetterCombinations();
        String input = "67";
        List<String> result = lc.getCombinations(input);
        System.out.println("Possible combinations for digits " + input + ": " + result);
    }
}
// done