import java.util.Scanner;

//Bài 5: Một số được gọi là số thuận nghịch nếu ta đọc từ trái sang phải hay từ phải sang trái
//số đó ta vẫn nhận được một số giống nhau.
//Hãy nhập một số và kiểm tra xem số đó có phải số thuật nghịch hay không (ví dụ số: 558855).
public class Ex5 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Integer number = new Scanner(System.in).nextInt();
        String process_number = String.valueOf(number);
        int reversible_number = 0;
        if (process_number.length() % 2 == 0) {
            for (int i = 0; i <= process_number.length() / 2 - 1; i++) {
                reversible_number += ((int) process_number.charAt(i)-48) * (Math.pow(10, process_number.length() - 1 - i) + Math.pow(10, i));
                //((int) process_number.charAt(i)-48) because of ASCII
            }
        } else {
            for (int i = 0; i <= process_number.length() / 2; i++) {
                reversible_number += ((int) process_number.charAt(i)-48) * (Math.pow(10, process_number.length() - 1 - i)+Math.pow(10, i));
                if (i == (process_number.length() - 1) / 2) {
                    reversible_number -= ((int) process_number.charAt(i)-48) * Math.pow(10, i);
                }
            }
        }
        if (reversible_number == number) {
            System.out.println(number + " is a reversible number.");
        } else {
            System.out.println(number + " isn't a reversible number.");
        }
    }
}
