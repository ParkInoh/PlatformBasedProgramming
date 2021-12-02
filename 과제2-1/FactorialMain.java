import java.util.Scanner;

public class FactorialMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");

        int n = scanner.nextInt();
        scanner.close();

        long[] values = new long[n];

        for (int i = 0; i < n; i++) {
                System.out.println("Factorial of " + (i + 1) + " = " + getFactorial(values, i));
        }
    }

    private static long getFactorial(long[] values, final int n) {
        if (n == 0) {
            values[0]=1;
            return values[0];
        }
        else {
            values[n] = values[n - 1] * (n + 1);
            return values[n];
        }
    }
}
