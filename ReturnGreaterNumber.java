import java.util.Scanner;

public class ReturnGreaterNumber {
    public static int greaterNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter Number 2 : ");
        int b = sc.nextInt();
        int result = greaterNumber(a, b);

        System.out.println("The greater number is : " + result);
    }
}
