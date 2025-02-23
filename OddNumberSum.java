import java.util.Scanner;

public class OddNumberSum {
    public static int PrintSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        int result = PrintSum(n);

        System.out.println("The sum of odd number from (1-" + n + ") : " + result);
    }

}
