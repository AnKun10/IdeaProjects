package entity;

public class Rectangle implements Displayable,Calculatable{
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public void calArea() {
        System.out.println("area: "+this.width*this.length);
    }

    @Override
    public void display() {
        System.out.println("length: "+this.length);
        System.out.println("width: "+this.width);
    }
}
