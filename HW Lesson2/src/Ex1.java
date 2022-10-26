import java.util.Scanner;

//Bài 1: Giải và biện luận phương trình bậc nhất ax + b = 0, với a và b nhập vào từ bàn phím.
public class Ex1 {
    public static void main(String[] args) {
        double a,b;
        String result;

        System.out.println("Linear Function: ax + b = 0 with");
        Scanner input = new Scanner(System.in);
        System.out.print("\ta = ");
        a = input.nextDouble();
        System.out.print("\tb = ");
        b = input.nextDouble();
        result = (a != 0) ? "The zero x of the function is "+(-b/a) : (b != 0) ? "The system has no solution" : "The system has infinite solutions";
        System.out.println(result);
    }
}
