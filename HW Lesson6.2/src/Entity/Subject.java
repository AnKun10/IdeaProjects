package Entity;

import Constant.SubjectTypeConstant;

import java.util.Scanner;

public class Subject {
    private int id;
    private String name;
    private int credit;
    private String type;
    private int AUTO_ID = 0;

    public Subject() {
        if (AUTO_ID == 0) {
            AUTO_ID = 99;
        }
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

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Entity.Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", credit=" + credit +
                ", type='" + type + '\'' +
                '}';
    }

    public void infoInput() {
        System.out.print("Enter subject name: ");
        this.name = new Scanner(System.in).next();
        System.out.print("Enter number of subject's credits: ");
        this.credit = new Scanner(System.in).nextInt();
        System.out.println("###");
        System.out.println("Entity.Subject type:");
        System.out.println("1, General");
        System.out.println("2, Major Core");
        System.out.println("3, Major");
        System.out.println("###");
        int typeTemp;
        do {
            System.out.print("Enter subject type: ");
            typeTemp = new Scanner(System.in).nextInt();
            if (typeTemp <= 3 && typeTemp >= 1) {
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        switch (typeTemp) {
            case 1:
                this.type = SubjectTypeConstant.GENERAL;
                break;
            case 2:
                this.type = SubjectTypeConstant.MAJOR_CORE;
                break;
            case 3:
                this.type = SubjectTypeConstant.MAJOR;
                break;
        }
    }
}
