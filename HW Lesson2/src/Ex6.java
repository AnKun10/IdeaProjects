import java.util.Scanner;

//Bài 6: Nhập bán kính hình tròn, tính diện tích hình tròn đó
public class Ex6 {
    public static void main(String[] args) {
        double radius, area;
        final float PI = 3.14f;

        Scanner input = new Scanner(System.in);
        System.out.print("Radius = ");
        radius = input.nextDouble();
        area = Math.pow(radius, 2)*PI;
        System.out.println("=> Area = "+area);

    }
}
