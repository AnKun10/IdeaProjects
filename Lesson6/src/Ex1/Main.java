package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.print("Enter height = ");
        double height = new Scanner(System.in).nextDouble();
        System.out.print("Enter width = ");
        double width = new Scanner(System.in).nextDouble();
        rectangle.setHeight(height);
        rectangle.setWidth(width);
        System.out.println("Area = "+rectangle.getArea());
        System.out.println("Perimeter = "+rectangle.getPerimeter());
    }
}
