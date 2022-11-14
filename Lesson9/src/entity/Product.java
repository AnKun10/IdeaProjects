package entity;

import constant.ProductTypeConstant;

import java.util.Scanner;

public class Product implements Inputable {
    private int id;
    private String name;
    private String type;
    private int price;
    private int quantity;
    private static int AUTO_ID = 999;

    public Product() {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }


    @Override
    public void infoInput() {
        System.out.print("Enter name: ");
        this.name = new Scanner(System.in).next();
        do {
            System.out.print("Enter price: ");
            this.price = new Scanner(System.in).nextInt();
            if (price >= 0) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        do {
            System.out.print("Enter quantity: ");
            this.quantity = new Scanner(System.in).nextInt();
            if (quantity > 0) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        System.out.println("###");
        System.out.println("Product type:");
        System.out.println("1, ELECTRONICS");
        System.out.println("2, REFRIGERATION");
        System.out.println("3, COMPUTER");
        System.out.println("4, OFFICE");
        System.out.println("###");
        int typeTemp;
        do {
            System.out.print("Enter product type: ");
            typeTemp = new Scanner(System.in).nextInt();
            if (typeTemp <= 4 && typeTemp >= 1) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        switch (typeTemp) {
            case 1:
                this.setType(ProductTypeConstant.ELECTRONICS.value);
                break;
            case 2:
                this.setType(ProductTypeConstant.REFRIGERATION.value);
                break;
            case 3:
                this.setType(ProductTypeConstant.COMPUTER.value);
                break;
            case 4:
                this.setType(ProductTypeConstant.OFFICE.value);
                break;
        }
    }
}
