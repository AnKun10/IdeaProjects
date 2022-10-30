import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.print("Enter a = ");
        double a = new Scanner(System.in).nextInt();
        System.out.print("Enter b = ");
        double b = new Scanner(System.in).nextInt();
        System.out.println("The sum of a & b = "+Sum(a,b));
    }

    public static double Sum(double a, double b) {
        return a + b;
    }
}
