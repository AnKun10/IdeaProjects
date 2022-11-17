package entity;

import java.util.Scanner;

public class Product implements Inputable {
    private int id;
    private String name;
    private int quantity;
    private double price;
    private String unit;
    private static int AUTO_ID = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", unit=" + unit +
                '}';
    }

    @Override
    public void inputInfo() {
        AUTO_ID++;
        this.id = AUTO_ID;
        System.out.print("Enter name: ");
        this.name = new Scanner(System.in).next();
        do {
            System.out.print("Enter quantity: ");
            this.quantity = new Scanner(System.in).nextInt();
            if (this.quantity > 0) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        do {
            System.out.print("Enter price: ");
            this.price = new Scanner(System.in).nextDouble();
            if (this.price > 0) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        System.out.print("Enter unit: ");
        this.unit = new Scanner(System.in).next();
    }
}
