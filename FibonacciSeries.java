import java.util.Scanner;

public class FibonacciSeries {
    public static void fibonacciSeriesCalculation(int n) {
        int firstTerm = 0, secondTerm = 1;
        System.out.print("Fibonacci Series of " + n + " terms : ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        
        fibonacciSeriesCalculation(n);
    }
}
