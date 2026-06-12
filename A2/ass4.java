// Java program to find all permuttions of a given string using recursion.
// Note: You are supposed to use at least two classes and one object in your program.
import java.util.Scanner;
class Permutations {
    // Function to generate all permutations of a string
    public void permute(String str, String ans) {
        // If the string is empty, print the accumulated answer
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Get the current character
            char ch = str.charAt(i);
            // Get the remaining characters after removing the current character
            String ros = str.substring(0, i) + str.substring(i + 1);
            // Recur with the remaining characters and the accumulated answer
            permute(ros, ans + ch);
        }
    }
}

public class ass4 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        // Create an object of the Permutations class
        Permutations perm = new Permutations();
        System.out.println("Permutations of the string are:");
        // Call the permute method to generate and print all permutations
        perm.permute(str, "");
        // Close the scanner
        sc.close();
    }
}
// done