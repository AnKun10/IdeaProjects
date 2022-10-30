import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("Enter n = ");
        int n = new Scanner(System.in).nextInt();
        double S = 0;
        for (double i = 1; i <= n; i++) {
            S += 1/i;
        }
        System.out.println(S);
    }
}
