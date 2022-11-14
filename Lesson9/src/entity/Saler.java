package entity;

import java.time.LocalDate;
import java.util.Scanner;

public class Saler extends Person{
    private int id;
    private String contract;
    private static int AUTO_ID = 999;

    public Saler(){
        AUTO_ID++;
        this.id = AUTO_ID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "Saler{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", id=" + id +
                ", contract=" + contract +
                '}';
    }

    @Override
    public void infoInput() {
        super.infoInput();
        System.out.print("Signing date of contract: ");
        this.contract = new Scanner(System.in).next();
    }
}
