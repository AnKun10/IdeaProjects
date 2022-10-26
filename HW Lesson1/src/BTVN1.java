//Bài 1: Tính chu vi và diện tích hình chữ nhật khi biết chiều dài và chiều rộng của chúng.
public class BTVN1 {
    public static void main(String[] args) {
        float height = 13.43f;
        float width = 25.61f;

        System.out.println("Hình chữ nhật có chiều dài là "+height+" và chiều rộng là "+width);
        System.out.println("Chu vi hình chữ nhật đó là "+(height+width)*2);
        System.out.println("Diện tích hình chữ nhật đó là "+(height*width));
    }
}
