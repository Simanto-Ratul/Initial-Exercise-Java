import java.util.Scanner;

public class PowerCalculation {
    public static double calculateThePower(int x, int n) {
        double result = 1;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                result *= x;
            }
        } else if (n < 0) {
            for (int i = 0; i < -n; i++) {
                result /= x;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number : ");
        int x = sc.nextInt();
        System.out.print("Enter the exponent(power) : ");
        int n = sc.nextInt();
        double result = calculateThePower(x, n);

        System.out.println(x + "raise to the power" + n + "is : " + result);
    }
}
// Updated