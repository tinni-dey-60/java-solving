import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        // Setting up the Scanner to get input
        Scanner sc = new Scanner(System.in);

        // Asking for the number of terms in the Fibonacci series
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt(); // Reads how many numbers to generate

        // Starting with the first two Fibonacci numbers
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: ");

        // Generating the series: for each term, print the current number and calculate
        // the next one.
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second; // Next number is the sum of the previous two
            first = second; // Shift the first number forward
            second = next; // Update the second number with the new value
        }

        // Closing the scanner
        sc.close();
    }
}
