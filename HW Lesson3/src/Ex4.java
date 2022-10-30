import java.util.Scanner;

//Bài 4: Viết chương trình liệt kê n số nguyên tố đầu tiên.
public class Ex4 {
    public static void main(String[] args) {
        System.out.print("Enter n = ");
        int n = new Scanner(System.in).nextInt();
        String primenumbs = "";
        boolean isprime = true;
        for (Integer i = 3; i <= n; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0){
                    isprime = false;
                    break;
                }
            }
            if (isprime){
                primenumbs += ", " +i;
            }
            isprime = true;
        }
        System.out.println("Prime number(s) from 1->n is(are) 2"+primenumbs);
    }
}
