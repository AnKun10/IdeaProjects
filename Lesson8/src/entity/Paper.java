package entity;

import java.util.Scanner;

public class Paper implements Inputable{
    private int id;
    private String name;
    private int price;
    private int AUTO_ID = 99;

    public Paper(){
        AUTO_ID++;
        this.id = AUTO_ID;
    }

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public void inputInfo() {
        System.out.print("Enter name: ");
        this.name = new Scanner(System.in).next();
        System.out.print("Enter price: ");
        this.price = new Scanner(System.in).nextInt();
    }
}
