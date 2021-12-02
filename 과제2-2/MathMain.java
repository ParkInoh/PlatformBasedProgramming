import java.util.Scanner;

public class MathMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int begin, end;

        System.out.println("Enter a begin number: ");
        begin = scanner.nextInt();
        System.out.println("Enter an end number: ");
        end = scanner.nextInt();
        scanner.close();

        System.out.printf("Sum between %d and %d : %,d%n", begin, end, getSumBetween(begin, end));
        System.out.printf("Product between %d and %d : %,d%n", begin, end, getProductBetween(begin, end));
    }

    public static long getSumBetween(int begin, int end) {
        long result = 0;
        for (int i = 0; i < end - begin + 1; i++)
            result += (begin + i);
        return result;
    }

    public static long getProductBetween(int begin, int end) {
        long result = 1;
        for (int i = 0; i < end - begin + 1; i++)
            result *= (begin + i);
        return result;
    }
}