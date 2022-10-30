import java.util.Scanner;

//Bài 2: Nhập số tự nhiên n rồi liệt kê các ước số của nó. Có bao nhiêu ước số?
public class Ex2 {
    public static void main(String[] args) {
        System.out.print("Enter n = ");
        int n = new Scanner(System.in).nextInt();
        int divisor_count = 2;
        String divisors = "";
        if (n == 1){
            divisors = "is 1";
        }
        else {
            divisors += "are 1, "+n;
        }
        for (Integer i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                divisor_count += 2;
                divisors += ", " + String.valueOf(i) + ", " + String.valueOf(n/i);
            }

        }
        System.out.println("The divisors of n "+divisors);
        System.out.println("=> The number of divisors of n is "+divisor_count);
    }
}
