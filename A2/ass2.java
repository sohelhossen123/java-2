// You are given a function. 
// int CheckPassword(char str[], int n);
// The function takes a string and its length as input and returns 1 if the password is valid, otherwise it returns 0.
// A password is considered valid if it meets the following conditions:
// At least 4 characters long.
// At least one numeric digit (0-9).
// At least one uppercase letter (A-Z).
// Must not have space or slash characters.
// Starting character must not be a number.
// Your task is to implement the CheckPassword function according to the above criteria.
// Note: You are supposed to use at least two classes and one object in your program.

import java.util.Scanner;
class PasswordChecker {
    public int CheckPassword(char[] str, int n) {
        if (n < 4) {
            return 0; // Password must be at least 4 characters long
        }
        boolean hasDigit = false;
        boolean hasUpperCase = false;
        for (char c : str) {
            if (Character.isDigit(c)) {
                hasDigit = true; // Check for numeric digit
            }
            if (Character.isUpperCase(c)) {
                hasUpperCase = true; // Check for uppercase letter
            }
            if (c == ' ' || c == '/') {
                return 0; // Password must not contain space or slash characters
            }
        }
        if (!hasDigit || !hasUpperCase) {
            return 0; // Password must have at least one numeric digit and one uppercase letter
        }
        if (Character.isDigit(str[0])) {
            return 0; // Starting character must not be a number
        }
        return 1; // Password is valid
    }
}

public class ass2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        PasswordChecker checker = new PasswordChecker();
        int result = checker.CheckPassword(password.toCharArray(), password.length());
        if (result == 1) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }
        scanner.close();
    }
}
// done