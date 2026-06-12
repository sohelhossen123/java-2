// Java program to print the first 10 Fibonacci numbers and their sum
class ass1 {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;
        int sum = 0;

        System.out.println("First 10 Fibonacci numbers:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            sum += a;

            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println("\nSum = " + sum);
    }
}
//done