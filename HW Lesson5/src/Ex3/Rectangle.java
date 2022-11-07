package Ex3;

import java.util.Scanner;

public class Rectangle {
    public double width;
    public double height;
    public String color;
    
    public Rectangle(){
        width = 1;
        height = 1;
        System.out.println("The default width & height are 1 & 1");
    }
    public Rectangle(double width, double height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }


    public double getWidth(){
        System.out.println("The width of the rectangle is "+width);
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
        System.out.println("New width of the rectangle is "+width);
    }
    public double getHeight() {
        System.out.println("The height of the rectangle is "+height);
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
        System.out.println("New height of the rectangle is "+height);
    }
    public String getColor() {
        System.out.println("The color of the rectangle is "+color);
        return color;
    }
    public void setColor(String color) {
        this.color = color;
        System.out.println("New color of the rectangle is "+color);
    }
    public double findArea(){
        return height*width;
    }
    public double findPerimeter(){
        return (height+width)*2;
    }
    public void input(){
        System.out.print("Width of the rectangle = ");
        width = new Scanner(System.in).nextDouble();
        System.out.print("Height of the rectangle = ");
        height = new Scanner(System.in).nextDouble();
        System.out.print("Color of the rectangle = ");
        color = new Scanner(System.in).nextLine();
    }
}
