import java.util.Scanner;

//Bài 3: Nhập vào chiều dài và chiều rộng của hình chữ nhật, tính chu vi và diện tích của hình chữ nhật đó.
public class Ex3 {
    public static void main(String[] args) {
        double length, width, neutralL, neutralW, perimeter, area;
        String checker, result;

        Scanner input = new Scanner(System.in);
        System.out.print("Length of the Rectangle = ");
        neutralL = input.nextDouble();
        System.out.print("Width of the Rectangle = ");
        neutralW = input.nextDouble();

        width = Math.min(neutralL, neutralW);
        length = Math.max(neutralL, neutralW);
        area = length*width;
        perimeter = (length+width)*2;

        checker = (neutralL > neutralW & neutralW > 0) ? "\nProceeding....." : (neutralL < neutralW & neutralL > 0) ? "\nThe actual Length & Width have to be "+length+" & "+width+" respectively." : (neutralL == neutralW & neutralL > 0) ? "\nThis is a Square" : "\nERROR 404";
        result = (neutralL <= 0 | neutralW <= 0) ? "\nEnding Program." : "\nThe Perimeter of the Shape is "+perimeter+"\nThe Area of the Shape is "+area;
        System.out.println(checker);
        System.out.println(result);

    }
}
