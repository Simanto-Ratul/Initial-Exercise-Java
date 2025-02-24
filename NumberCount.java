import java.util.Scanner;

public class NumberCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positiveCounter = 0;
        int negativeCounter = 0;
        int zeroCounter = 0;
        char choice;

        do {
            System.out.print("Enter your number : ");
            int number = sc.nextInt();

            if (number > 0) {
                positiveCounter++;
            } else if (number < 0) {
                negativeCounter++;
            } else {
                zeroCounter++;
            }

            System.out.print("Do want to continue? (y/n) : ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Positive number count : " + positiveCounter);
        System.out.println("Negative number count : " + negativeCounter);
        System.out.println("Zero number count : " + zeroCounter);
    }

}
