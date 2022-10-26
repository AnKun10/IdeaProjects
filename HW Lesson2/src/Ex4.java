import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//Bài 4: Nhập vào ngày tháng năm sinh của một người theo định dạng nhất định, tính tuổi của người đó (chỉ quan tâm tới năm, không cần tính chính xác tới ngày và tháng).
public class Ex4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birthday: ");
        String s1 = input.nextLine();
        LocalDate birthday = LocalDate.parse(s1, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalDate now = LocalDate.now();
        int age = now.getYear() - birthday.getYear();
        System.out.println("=> Your Age: "+age);
    }
}
