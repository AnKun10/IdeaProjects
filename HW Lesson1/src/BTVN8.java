//Bài 8: Tìm số lớn nhất trong 3 số nguyên a, b, c. Sử dụng lớp Math hỗ trợ.
import java.lang.Math;
public class BTVN8 {
    public static void main(String[] args) {
        int a = 14;
        int b = 25;
        int c = 34;
        int s = a;
        int max;


        s = (a >= b && a >= c) ? a : s;
        s = (b >= a && b >= c) ? b : s;
        s = (c >= a && c >= b) ? c : s;
        max = Math.max(a,b);
        max = Math.max(max,c);

        System.out.println("3 số gồm "+a+","+b+" và "+c);
        System.out.println("Số lớn nhất trong 3 số trên là (cách 1): "+s);
        System.out.println("Số lớn nhất trong 3 số trên là (cách 2): "+max);
    }
}
