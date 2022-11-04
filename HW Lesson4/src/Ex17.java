import java.util.Scanner;

//Bài 17: Nhập 2 số tự nhiên m,n rồi kiểm tra xem chúng có nguyên tố cùng nhau không.
// (Hai số nguyên tố cùng nhau là 2 số có UCLN là 1).
public class Ex17 {
    public static void main(String[] args) {
        int m = input1();
        int n = input2();
        CommonDivisor(m,n);
    }

    public static int input1(){
        System.out.print("Enter m = ");
        return new Scanner(System.in).nextInt();
    }
    public static int input2(){
        System.out.print("Enter n = ");
        return new Scanner(System.in).nextInt();
    }

    public static void CommonDivisor(int m, int n){
        boolean is_coprime = false;
        if (m == 1 | n == 1) {
            is_coprime = true;
        } else {
            for (int i = 2; i <= Math.min(m, n); i++) {
                if (m % i == 0 & n % i == 0) {
                    is_coprime = false;
                    break;
                }
                is_coprime = true;
            }
        }
        if (is_coprime){
            System.out.println(m+", "+n+" are coprime");
            return;
        }
        System.out.println(m+", "+n+" aren't coprime");
    }
}
