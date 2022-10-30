import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n = ");
        double n = input.nextDouble();
        int S = 0;
        for (int count = 1; count <= n; count++){
            if (count % 2 == 0){
                S += count;
            }
        }
        System.out.println("Sum even numbers in the array = "+S);
    }
}
