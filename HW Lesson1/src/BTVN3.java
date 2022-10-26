//Bài 3: Tìm số lớn nhất trong 4 số biết trước.
import java.lang.Math;
public class BTVN3 {
    public static void main(String[] args) {
        float a = 14f;
        float b = 25f;
        float c = 34f;
        float d = 17f;
        float s = a;
        float max;


        s = (a >= b && a >= c && a >= d) ? a : s;
        s = (b >= a && b >= c && b >= d) ? b : s;
        s = (c >= a && c >= b && c >= d) ? c : s;
        s = (d >= a && d >= b && d >= c) ? d : s;
        max = Math.max(a,b);
        max = Math.max(max,c);
        max = Math.max(max,d);

        System.out.println("4 số gồm "+a+","+b+","+c+" và "+d);
        System.out.println("Số lớn nhất trong 4 số trên là (cách 1): "+s);
        System.out.println("Số lớn nhất trong 4 số trên là (cách 2): "+max);
    }
}
