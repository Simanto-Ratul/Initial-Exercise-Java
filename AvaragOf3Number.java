import java.util.Scanner;

public class AvaragOf3Number {
    public static float PrintAvarage(int a, int b, int c) {
        float avarage = (a + b + c) / 3.0f;
        return avarage;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter c : ");
        int c = sc.nextInt();

        System.out.println("The avarage of 3 number is : " + PrintAvarage(a, b, c));
    }
}