//Print series upto a limit

import java.util.Scanner;

class ass5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int n = sc.nextInt();

        int a = 0, b = 1;   // Fibonacci
        int neg = -1;       // Negative sequence

        for (int i = 1; i <= n; i++) {

            if (i % 2 != 0) {   // Odd position → Fibonacci
                System.out.print(a + " ");

                int next = a + b;
                a = b;
                b = next;
            } else {            // Even position → Negative sequence
                System.out.print(neg + " ");
                neg = neg - 3;
            }
        }

        sc.close();
    }
}