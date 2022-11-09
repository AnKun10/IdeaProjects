package Entity;

import java.util.Scanner;

public class Person {
    protected String fullName;
    protected String address;
    protected String phone;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Entity.Person{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void infoInput(){
        System.out.print("Enter full name: ");
        this.fullName = new Scanner(System.in).next();
        System.out.print("Enter address: ");
        this.address = new Scanner(System.in).next();
        System.out.print("Enter phone number: ");
        this.phone = new Scanner(System.in).next();
    }
}
