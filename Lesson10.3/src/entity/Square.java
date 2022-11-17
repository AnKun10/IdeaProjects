package entity;

public class Square implements Displayable,Calculatable{
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public void calArea() {
        System.out.println("area: "+this.side*this.side);
    }

    @Override
    public void display() {
        System.out.print("side: "+this.side);
    }
}
