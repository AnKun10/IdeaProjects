import java.util.Scanner;

//Bài 14: Nhập số tự nhiên n rồi tính tổng
public class Ex14 {
    public static void main(String[] args) {
        double n = input();
        double sum = cal(n);
        System.out.println("1 + 1/2 + 1/3 + ... + 1/n = "+sum);
    }

    public static double input() {
        System.out.print("Enter n = ");
        return new  Scanner(System.in).nextDouble();
    }

    public static double cal(double n){
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum += 1/i;
        }
        return sum;
    }
}
