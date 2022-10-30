import java.util.Scanner;

//Bài 7: Viết chương trình nhập hai số nguyên n,m và in ra hình chữ nhật đặc các dấu * kích thước n*m.
// Ví dụ với n=5,m=4:
public class Ex7 {
    public static void main(String[] args) {
        System.out.print("Enter n = ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Enter m = ");
        int m = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n*m; i++) {
            System.out.print("*\t");
            if (i % n == 0){
                System.out.println();
            }
        }
    }
}
