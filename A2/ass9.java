// A content editing software needs a funtion ton convert a sentence into title case, 
// where the first letter of each word should be uppercase.
// Note: You are supposed to use at least two classes and one object in your program.

import java.util.Scanner;
class TitleCaseConverter {
    public String convertToTitleCase(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder titleCaseSentence = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                titleCaseSentence.append(Character.toUpperCase(word.charAt(0)))
                                .append(word.substring(1).toLowerCase())
                                .append(" ");
            }
        }

        return titleCaseSentence.toString().trim();
    }
}

public class ass9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TitleCaseConverter converter = new TitleCaseConverter();

        System.out.println("Enter a sentence to convert to title case:");
        String inputSentence = scanner.nextLine();

        String titleCaseSentence = converter.convertToTitleCase(inputSentence);
        System.out.println("Title Case: " + titleCaseSentence);

        scanner.close();
    }
}
// done