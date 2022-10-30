import java.util.Scanner;

//Bài 8: Viết chương trình nhập hai số nguyên n,m và in ra hình chữ nhật rỗng các dấu * kích thước n*m.
// Ví dụ với n=5,m=4:
public class Ex8 {
    public static void main(String[] args) {
        System.out.print("Enter n = ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Enter m = ");
        int m = new Scanner(System.in).nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 | j == n | (1 < j & j < n & i == 1) | (1 < j & j < n & i == m)) {
                    System.out.print("*\t");
                }
                else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}
