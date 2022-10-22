//Bài 6: Giải phương trình bậc nhất một ẩn ax + b = 0 (với a khác 0).
public class BTVN6 {
    public static void main(String[] args) {
        float a = 12.3213f, b = 123.433f;
        String s = (a != 0) ? "Phương trình có dạng "+a+"x + "+b+" = 0. Phương trình có nghiệm x = "+(-b/a) : "Đây không phải phương trình bậc nhất 1 ẩn";
        System.out.println(s);

    }
}
