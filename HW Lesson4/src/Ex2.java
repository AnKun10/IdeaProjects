//Bài 2: Viết chương trình liệt kê các số nguyên có 7 chữ số thoả mãn:
//a) Là số nguyên tố.
//b) Tất cả các chữ số là nguyên tố
//c) Đảo của nó cũng là một số nguyên tố
public class Ex2 {
    public static void main(String[] args) {
        boolean number_check, is_prime, is_reversible_prime;
        System.out.println("Numbers that satisfy the conditions are:");
        for (int i = 2222222; i <= 7777777; i++) {
            number_check = number_check(i);
            is_prime = is_prime(i);
            is_reversible_prime=is_reversible_prime(i);
            if (number_check & is_prime & is_reversible_prime) {
                System.out.println(i);
            }
        }
    }

    public static boolean number_check(int n) {
        int temp;
        boolean number_check = false;
        while (n != 0) {
            temp = n % 10;
            n /= 10;
            if (temp == 2 | temp == 3 | temp == 5 | temp == 7) {
                number_check = true;
                continue;
            }
            number_check = false;
            break;
        }
        return number_check;
    }

    public static boolean is_prime(int n) {
        boolean is_prime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                is_prime = false;
                break;
            }
        }
        return is_prime;
    }

    public static boolean is_reversible_prime(int n) {
        int temp = 0, process_numb = n;
        boolean is_reversible_prime = false;
        while (n != 0) {
            temp = 10 * temp + n % 10;
            n /= 10;
        }
        if (is_prime(temp)){
            is_reversible_prime = true;
        }
        return is_reversible_prime;
    }
}
