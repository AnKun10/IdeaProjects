//Bài 7: Giải phương trình bậc hai một ẩn ax2 + bx + c = 0 (với a khác 0, chỉ xét trường hợp với a,b,c để phương trình có 2 nghiệm riêng biệt).
import java.lang.Math;
public class BTVN7 {
    public static void main(String[] args) {
        float a = 1f, b = 2f, c = 1f;
        double delta = b*2 - 4*a*c;
        double x1 = (delta >= 0) ? (-b+(Math.sqrt(delta)))/(2*a) : 0;
        double x2 = (delta >= 0) ? (-b-(Math.sqrt(delta)))/(2*a) : 0;
        String k = "";

        String s = (a != 0) ? "Phương trình bậc 2 là "+a+"x^2 + "+b+"x + "+c+" = 0" : "Đây không phải phương trình bậc 2";
        k = (delta < 0 && a != 0) ? "Phương trình vô nghiệm." : k;
        k = (delta > 0 && a != 0) ? "Phương trình có 2 nghiệm phân biệt là "+x1+" và "+x2 : k;
        k = (delta == 0 && a != 0) ? "Phương trình có nghiệm kép là "+x1 : k;

        System.out.println(s);
        System.out.println(k);


    }
}
