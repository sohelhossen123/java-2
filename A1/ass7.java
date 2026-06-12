// Print sequence upto  a given limit

import java.util.Scanner;

class ass7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int n = sc.nextInt();

        int even = 2;     // Even numbers
        int fact = 1;     // Factorial value
        int num = 1;      // Factorial counter

        for (int i = 1; i <= n; i++) {

            if (i % 2 != 0) {   // Odd position → Even numbers
                System.out.print(even + " ");
                even += 2;
            } else {            // Even position → Factorial
                fact = fact * num;
                System.out.print(fact + " ");
                num++;
            }
        }

        sc.close();
    }
}