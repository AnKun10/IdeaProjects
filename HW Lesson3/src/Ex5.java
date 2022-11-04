import java.util.Scanner;

//Bài 5: Một số được gọi là số thuận nghịch nếu ta đọc từ trái sang phải hay từ phải sang trái
//số đó ta vẫn nhận được một số giống nhau.
//Hãy nhập một số và kiểm tra xem số đó có phải số thuật nghịch hay không (ví dụ số: 558855).
public class Ex5 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int number = new Scanner(System.in).nextInt();
        int temp = number, process_number = 0;
        while (number != 0) {
            process_number = process_number * 10 + number % 10;
            number /= 10;
        }
        if (process_number == temp) {
            System.out.println(temp + " is a reversible number");
            return;
        }
        System.out.println(temp + " isn't a reversible number");
    }
}
