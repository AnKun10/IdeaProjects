//Bài 1: Viết chương trình liệt kê các số nguyên có 7 đến 9 chữ số thoả mãn:
//a) Là số thuận nghịch.
//b) Chỉ có chữ số 0, 6, 8
//c) Tổng chữ số chia hết cho 10
public class Ex1 {
    public static void main(String[] args) {
        boolean is_reversible = false, number_check = false, is_sum10 = false;
        System.out.println("Numbers that satisfy the conditions are:");
        for (int i = 60000006; i <= 888888888; i++) {
            is_reversible = is_reversible(i);
            number_check = number_check(i);
            is_sum10 = is_sum10(i);
            if (is_reversible & is_sum10 & number_check) {
                System.out.println(i);
            }
        }
    }

    public static boolean is_reversible(int n) {
        int temp = 0, process_numb = n;
        boolean is_reversible = false;
        while (n != 0) {
            temp = 10 * temp + n % 10;
            n /= 10;
        }
        if (temp == process_numb) {
            is_reversible = true;
        }
        return is_reversible;
    }

    public static boolean number_check(int n) {
        int temp;
        boolean number_check = false;
        while (n != 0) {
            temp = n % 10;
            n /= 10;
            if (temp == 6 | temp == 0 | temp == 8) {
                number_check = true;
                continue;
            }
            number_check = false;
            break;
        }
        return number_check;
    }

    public static boolean is_sum10(int n) {
        int temp = 0;
        boolean is_sum10 = false;
        while (n != 0) {
            temp += n % 10;
            n /= 10;
        }
        if (temp % 10 == 0) {
            is_sum10 = true;
        }
        return is_sum10;
    }
}
