//Bài 4: Khai căn một số dương bất kì, kết quả làm tròn tới 3 chữ số thập phân.
import java.lang.Math;
public class BTVN4 {
    public static void main(String[] args) {
        double s, d = 12.42432536, a = (Math.sqrt(d)) * 1000;
        s = (int) a;

        System.out.println("Số "+d+" có căn bậc 2 là "+a/1000);
        System.out.println("Căn bậc 2 trên làm tròn là "+s/1000);
    }
}
