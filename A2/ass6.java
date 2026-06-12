// A social media platform wants to automatically replace offensive words with *** in user-generated content. 
// Given a list of bad words, replace them in the input text.
// Note: You are supposed to use at least two classes and one object in your program.

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
class ContentFilter {
    private List<String> badWords;

    public ContentFilter(List<String> badWords) {
        this.badWords = badWords;
    }

    public String filterContent(String content) {
        for (String badWord : badWords) {
            content = content.replaceAll("(?i)" + badWord, "***");
        }
        return content;
    }
}

public class ass6 {
    public static void main(String[] args) {
        List<String> badWords = Arrays.asList("bad", "ugly", "wierd", "stupid");
        ContentFilter filter = new ContentFilter(badWords);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the content to filter: ");
        String content = scanner.nextLine();

        String filteredContent = filter.filterContent(content);
        System.out.println("Filtered content: " + filteredContent);

        scanner.close();
    }
}
// done