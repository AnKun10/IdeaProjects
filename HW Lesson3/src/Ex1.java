import java.util.Scanner;

//Bài 1: Viết chương trình nhập vào 4 số nguyên a, b, c và d. In ra màn hình kết quả xem số nào lớn nhất trong 4 số vừa nhập.
public class Ex1 {
    public static void main(String[] args) {
        System.out.print("Enter a = ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Enter b = ");
        int b = new Scanner(System.in).nextInt();
        System.out.print("Enter c = ");
        int c = new Scanner(System.in).nextInt();
        System.out.print("Enter d = ");
        int d = new Scanner(System.in).nextInt();
        int max = Math.max(a,Math.max(b,Math.max(c,d)));
        System.out.println("The largest number is = "+max);
    }
}
