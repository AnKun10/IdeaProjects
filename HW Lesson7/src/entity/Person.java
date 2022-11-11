package entity;

import java.util.Scanner;

public class Person implements Inputable{
    protected String name;
    protected String phone;
    protected String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public void inputInfo() {
        System.out.print("Enter name: ");
        this.name = new Scanner(System.in).next();
        System.out.print("Enter phone: ");
        this.phone = new Scanner(System.in).next();
        System.out.print("Enter address: ");
        this.address = new Scanner(System.in).next();
    }
}
