import java.util.Scanner;

public class CricumferenceOfCircle {
    public static double cricumferenceOfaCircle(int r) {
        double cricumference = (2 * 3.1416 * r);
        return cricumference;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of a circle : ");
        int r = sc.nextInt();

        double result = cricumferenceOfaCircle(r);
        System.out.println("Cricumference of a circle is : " + result);
    }
}
