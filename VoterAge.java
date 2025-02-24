import java.util.Scanner;

public class VoterAge {
    public static boolean age(int a) {
        return a >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int a = sc.nextInt();

        boolean result = age(a);
        if (result) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}
