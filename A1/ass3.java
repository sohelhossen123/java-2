//First 8 +ve primes from the fibonacci sequence
class ass3 {
    public static void main(String[] args) {

        int a = 0, b = 1;
        int count = 0;

        System.out.println("Fibonacci numbers (only primes):");

        while (count < 8) {
            int num = a;

            // Manual prime check
            if (num >= 2) {
                int factors = 0;

                for (int i = 1; i <= num; i++) {
                    if (num % i == 0) {
                        factors++;
                    }
                }

                if (factors == 2) {
                    System.out.print(num + " ");
                    count++;
                }
            }

            int next = a + b;
            a = b;
            b = next;
        }

        // Printing primes separately
        System.out.println("\nPrime numbers separately:");

        a = 0; 
        b = 1; 
        count = 0;

        while (count < 8) {
            int num = a;

            if (num >= 2) {
                int factors = 0;

                for (int i = 1; i <= num; i++) {
                    if (num % i == 0) {
                        factors++;
                    }
                }

                if (factors == 2) {
                    System.out.print(num + " ");
                    count++;
                }
            }

            int next = a + b;
            a = b;
            b = next;
        }
    }
}
//done