package entity;

import constant.ReporterType;

import java.util.Scanner;

public class Reporter extends Person {
    private int id;
    private String type;
    private int AUTO_ID = 9999;

    public Reporter(){
        AUTO_ID++;
        this.id = AUTO_ID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Reporter{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        System.out.println("###");
        System.out.println("Reporter Type:");
        System.out.println("1, Professional");
        System.out.println("2, Amateur");
        System.out.println("3, Collaborator");
        System.out.println("###");
        int typeTemp;
        do {
            System.out.print("Enter type: ");
            typeTemp = new Scanner(System.in).nextInt();
            if (typeTemp >= 1 && typeTemp <= 3) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        switch (typeTemp) {
            case 1:
                setType(ReporterType.PROFESSIONAL.value);
                break;
            case 2:
                setType(ReporterType.AMATEUR.value);
                break;
            case 3:
                setType(ReporterType.COLLABORATOR.value);
                break;
        }
    }
}
