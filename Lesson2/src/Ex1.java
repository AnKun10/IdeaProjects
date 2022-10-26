import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex1 {
    public static void main(String[] args) {
        LocalDateTime s1 = LocalDateTime.parse("02/11/2004", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(s1);
    }
}
