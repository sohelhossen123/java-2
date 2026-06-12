

import java.util.Scanner;

class ass8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = 1;

        // Find GCD using loop
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        System.out.println("GCD = " + gcd);

        sc.close();
    }
}
