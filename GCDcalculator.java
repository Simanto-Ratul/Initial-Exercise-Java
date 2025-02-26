import java.util.Scanner;

public class GCDcalculator {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        int result = gcd(a, b);

        System.out.print("The GCD of " + a + " and " + b + " is : " + result);
    }
}
