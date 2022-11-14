package entity;

import constant.DriverLevelConstant;

import java.util.Scanner;

public class Driver extends Person {
    private int id;
    private String level;
    private int AUTO_ID = 9999;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", level='" + level + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public void inputInfo() {
        AUTO_ID++;
        this.id = AUTO_ID;
        super.inputInfo();
        System.out.println("###");
        System.out.println("Driver level:");
        System.out.println("1, A");
        System.out.println("2, B");
        System.out.println("3, C");
        System.out.println("4, D");
        System.out.println("5, E");
        System.out.println("6, F");
        System.out.println("###");
        int levelTemp;
        do {
            System.out.print("Enter driver level: ");
            levelTemp = new Scanner(System.in).nextInt();
            if (levelTemp <= 6 && levelTemp >= 1) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        switch (levelTemp) {
            case 1:
                this.setLevel(DriverLevelConstant.A.value);
                break;
            case 2:
                this.setLevel(DriverLevelConstant.B.value);
                break;
            case 3:
                this.setLevel(DriverLevelConstant.C.value);
                break;
            case 4:
                this.setLevel(DriverLevelConstant.D.value);
                break;
            case 5:
                this.setLevel(DriverLevelConstant.E.value);
                break;
            case 6:
                this.setLevel(DriverLevelConstant.F.value);
                break;
        }
    }
}
