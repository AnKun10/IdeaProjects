//Bài 9: Tìm thương của 2 số nguyên, làm tròn kết quả tới 3 chữ số thập phân. Sử dụng lớp Math hỗ trợ.
import java.lang.Math;
public class BTVN9 {
    public static void main(String[] args) {
        double b = 123124, c = 331, a = b/c, s = Math.round(a*1000);

        System.out.println("Thương của 2 số nguyên "+b+" và "+c+" là: "+a);
        System.out.println("Thương làm tròn là: "+s/1000);
    }
}

