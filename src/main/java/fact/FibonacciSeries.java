package fact;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int n = scanner.nextInt();

        int a = 0, b = 1, next;
        System.out.print("Fibonacci Series: " + a + ", " + b);

        for (int i = 2; i < n; i++) {
            next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }
        scanner.close();
    }
}
