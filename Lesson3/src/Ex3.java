import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int i = 0,n,S = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n = ");
        n = input.nextInt();
        do {
            S += i;
            i += 1;
        } while (i <= n);
        System.out.print(S);

    }
}
