import java.util.Scanner;

//Bài 6: Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ.
//Ví dụ: Số 8545604 có tổng các chữ số là: 8+5+4+5+6+0+4=32
public class Ex6 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Integer number = new Scanner(System.in).nextInt();
        String process_number = String.valueOf(number);
        int sum = 0;
        for (int i = 0; i < process_number.length(); i++) {
            sum += (int) process_number.charAt(i)-48;
            //((int) process_number.charAt(i)-48) because of ASCII
        }
        System.out.println("Sum of các chữ số in the number = "+sum);
    }
}
