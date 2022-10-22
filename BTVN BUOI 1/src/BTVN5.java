//Bài 5: Tính sin, cos của một góc trong tam giác vuông khi biết độ dài 3 cạnh.
public class BTVN5 {
    public static void main(String[] args) {
        float AB = 4f, AC = 3f, BC = 5f;
        System.out.println("Tam giác ABC vuông tại A");
        System.out.println("Sin góc B = "+(AC/BC));
        System.out.println("Cos góc B = "+(AB/BC));
        System.out.println("Sin góc C = "+(AB/BC));
        System.out.println("Cos góc C = "+(AC/BC));
    }
}
