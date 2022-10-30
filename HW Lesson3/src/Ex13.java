import java.util.Scanner;

//Bài 13: Nhập số tự nhiên n rồi tính tổng các số tự nhiên không lớn hơn n và chia hết cho 7.
public class Ex13 {
    public static void main(String[] args) {
        System.out.print("Enter n = ");
        int n = new Scanner(System.in).nextInt();
        String numbers = "";
        for (int i = 1; i <= n; i++) {
            if (i % 7 == 0) {
                numbers += ", " + i;
                i += 6;
            }
        }
        System.out.println("7 can be divided by " + numbers + " (the numbers in the interval [1;n])");
    }
}
