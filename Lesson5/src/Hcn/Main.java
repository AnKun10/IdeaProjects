package Hcn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter length = ");
        double length = new Scanner(System.in).nextDouble();
        System.out.print("Enter width = ");
        double width = new Scanner(System.in).nextDouble();
        Hcn hcn = new Hcn(length,width);
        hcn.CalArea();
        hcn.CalPerimeter();
    }
}
