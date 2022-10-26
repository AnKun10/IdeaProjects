import java.util.Scanner;

//Bài 2: Giải và biện luận phương trình bậc hai ax2 + bx + c = 0, với a, b và c nhập vào từ bàn phím, a khác 0.
public class Ex2 {
    public static void main(String[] args) {
        double a,b,c;
        String result;

        Scanner input = new Scanner(System.in);
        System.out.println("Quadratic Function: ax^2 + bx + c = 0 with");
        System.out.print("\ta = ");
        a = input.nextDouble();
        System.out.print("\tb = ");
        b = input.nextDouble();
        System.out.print("\tc = ");
        c = input.nextDouble();

        double delta = (Math.pow(b, 2) - 4*a*c), x1 = (-b + Math.sqrt(delta))/(2*a), x2 = (-b - Math.sqrt(delta))/(2*a);

        result = (a != 0) ?
                (delta > 0) ? "The Function has 2 zeros: x1 = "+x1+", x2 = "+x2 :
                        (delta == 0) ? "The Function has double solution x1 = x2 = "+x1 : "The Function has no solution" :
                (b == 0) ?
                        (c == 0) ? "The System is not a Quadratic Function, and it has infinite solutions" : "The System is not a Quadratic Function, and it has no solution" :
                        "The System is not a Quadratic Function, and it has one solution x = "+(-c/b);

        System.out.printf("We have the Function of %sx^2 + %sx + %s = 0\n", a, b, c);
        System.out.println("\t=> "+result+".");
    }
}
