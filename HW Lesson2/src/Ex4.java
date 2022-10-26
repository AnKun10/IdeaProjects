import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAmount;
import java.util.Date;
import java.util.Scanner;

//Bài 4: Nhập vào ngày tháng năm sinh của một người theo định dạng nhất định, tính tuổi của người đó (chỉ quan tâm tới năm, không cần tính chính xác tới ngày và tháng).
public class Ex4 {
    public static void main(String[] args) throws ParseException {
        int age;
        Date birthday;
        LocalDate now;
        String date;

        now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatnow = now.format(formatter);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter birthday: ");
        date = input.nextLine();


    }
}
