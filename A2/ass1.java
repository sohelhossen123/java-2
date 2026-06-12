// Write a function to find the longest common prefix string amongst an array of strings.
//  If there is no common prefix, return an empty string.
// Note: You are supposed to use at least two classes and one object in your program.
class LongestCommonPrefixFinder {
    public String findLongestCommonPrefix(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }
        String prefix = strings[0];
        for (int i = 1; i < strings.length; i++) {
            while (strings[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}

public class ass1 {
    public static void main(String[] args) {
        LongestCommonPrefixFinder finder = new LongestCommonPrefixFinder();
        String[] strings = {"flower", "flow", "flight"};
        String longestCommonPrefix = finder.findLongestCommonPrefix(strings);
        System.out.println("Longest Common Prefix: " + longestCommonPrefix);
    }
}
// done
