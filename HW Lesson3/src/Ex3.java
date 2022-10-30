import java.util.Scanner;

//Bài 3: Viết chương trình tìm ước số chung lớn nhất và bội số chung nhỏ nhất của hai số nguyên dương a và b.
public class Ex3 {
    public static void main(String[] args) {
        System.out.print("Enter a = ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Enter b = ");
        int b = new Scanner(System.in).nextInt();
        for (int i = Math.max(a,b); i > 0; i--){
            if (a % i == 0 & b % i == 0){
                System.out.println("The greatest common divisor of a & b is "+i);
                System.out.println("The greatest common multiple of a & b is "+(a*b/i));
                break;
            }
        }
    }
}
